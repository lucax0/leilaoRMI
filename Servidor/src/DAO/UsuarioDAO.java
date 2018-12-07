/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Models.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class UsuarioDAO implements DAO<Usuario>{
//variaveis auxiliares
    //Para conter os comandos DML
    private PreparedStatement pst;
    //Para conter o resultado de um SELECT
    private ResultSet rs;
    //Para representar um objeto Usuario
    private Usuario usuario;

    @Override
    public boolean inserir(Usuario obj)
            throws SQLException,
            ClassNotFoundException {
        String sql = "INSERT INTO Usuario (nome, cpf, senha, email, tipousuario) "
                + "values (?, ?, ?, ? ,?)";

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //preencher os parametros do SQL
        
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getCpf());
        pst.setString(3, obj.getSenha());
        pst.setString(4, obj.getEmail());
        pst.setInt(5, obj.getTipo());
        //executar comando SQL
        if (pst.executeUpdate() == 0) { //não inseriu
            Banco.desconectar();
            return false;
        } else {
            Banco.desconectar();
            return true;
        }

    }

    @Override
    public boolean alterar(Usuario obj)
            throws SQLException,
            ClassNotFoundException {

        String sql = "UPDATE Usuario SET descricao = ? "
                + "WHERE codGenero = ?";

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //preencher os parametros do SQL
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getCpf());
        pst.setString(3, obj.getSenha());
        pst.setString(4, obj.getEmail());
        pst.setInt(5, obj.getTipo());
        //executar comando SQL
        if (pst.executeUpdate() == 0) { //não alterou
            Banco.desconectar();
            return false;
        } else {
            Banco.desconectar();
            return true;
        }
    }

    @Override
    public boolean excluir(Usuario obj)
            throws SQLException, ClassNotFoundException {

        String sql = "DELETE FROM Usuario WHERE codGenero = ?";

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //preencher os parametros do SQL
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getCpf());
        pst.setString(3, obj.getSenha());
        pst.setString(4, obj.getEmail());
        pst.setInt(5, obj.getTipo());
        //executar comando SQL
        if (pst.executeUpdate() == 0) { //não excluiu
            Banco.desconectar();
            return false;
        } else {
            Banco.desconectar();
            return true;
        }
    }

    @Override
    public Usuario pesquisar(Usuario obj)
            throws SQLException, ClassNotFoundException {

        String sql = "SELECT * FROM Usuario "
                + "WHERE cpf = ?";

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //preencher os parametros do SQL
        
        pst.setString(1, obj.getCpf());
        
        //executar comando SQL
        rs = pst.executeQuery();
        //verifica se encontrou o Usuario
        if (rs.next()) { //encontrou
            usuario = obj;
            usuario.setCpf(rs.getString("cpf"));
        } else {
            usuario = null;
        }
        rs.close(); //fecha o resultSet
        Banco.desconectar();
        return usuario;
    }

    @Override
    public List<Usuario> listar(String criterio) 
            throws SQLException, 
            ClassNotFoundException {
        String sql = "SELECT * FROM Usuario ";

        if (criterio.length() != 0) {
            sql += "WHERE " + criterio;
        }

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //executar comando SQL
        rs = pst.executeQuery();
        List<Usuario> usuarios = new ArrayList<>();
        while (rs.next()) { //percorre todos os registros
            usuario = new Usuario();
            usuario.setCpf(rs.getString("cpf"));
            usuario.setEmail(rs.getString("email"));
            usuario.setNome(rs.getString("nome"));
            usuario.setSenha(rs.getString("senha"));
            usuarios.add(usuario);
        } 
        rs.close(); //fecha o resultSet
        Banco.desconectar();
        return usuarios;
    }

    @Override
    public Usuario proximo() 
            throws SQLException, ClassNotFoundException {

        String sql = "SELECT IFNULL(max(cpf), 0) + 1 codigo "
                + "FROM Usuario";

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //executar comando SQL
        rs = pst.executeQuery();
        
        rs.next(); //lê o registro
        usuario = new Usuario();
        usuario.setCpf(rs.getString("cpf"));
        rs.close(); //fecha o resultSet
        Banco.desconectar();
        return usuario;
        
    }
}
