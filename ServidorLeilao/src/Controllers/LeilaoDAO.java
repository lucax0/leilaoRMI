/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class LeilaoDAO implements DAO<Leilao>{
   //variaveis auxiliares
    //Para conter os comandos DML
    private PreparedStatement pst;
    //Para conter o resultado de um SELECT
    private ResultSet rs;
    //Para representar um objeto Leilao
    private Leilao leilao;

    @Override
    public boolean inserir(Leilao obj)
            throws SQLException,
            ClassNotFoundException {
        String sql = "INSERT INTO Leilao (nome, lance, hora, descricao, sstatus, duracao) "
                + "values (?, ?, ? ,? ,? ,?)";

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //preencher os parametros do SQL
        pst.setInt(1, obj.getCodGenero());
        pst.setString(2, obj.getDescricao());
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
    public boolean alterar(Leilao obj)
            throws SQLException,
            ClassNotFoundException {

        String sql = "UPDATE genero SET descricao = ? "
                + "WHERE codGenero = ?";

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //preencher os parametros do SQL
        pst.setInt(2, obj.getCodGenero());
        pst.setString(1, obj.getDescricao());
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
    public boolean excluir(Leilao obj)
            throws SQLException, ClassNotFoundException {

        String sql = "DELETE FROM leilao WHERE codGenero = ?";

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //preencher os parametros do SQL
        pst.setInt(1, obj.getCodGenero());
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
    public Leilao pesquisar(Leilao obj)
            throws SQLException, ClassNotFoundException {

        String sql = "SELECT * FROM genero "
                + "WHERE codGenero = ?";

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //preencher os parametros do SQL
        pst.setInt(1, obj.getCodGenero());
        //executar comando SQL
        rs = pst.executeQuery();
        //verifica se encontrou o genero
        if (rs.next()) { //encontrou
            leilao = obj;
            leilao.setDescricao(rs.getString("descricao"));
        } else {
            leilao = null;
        }
        rs.close(); //fecha o resultSet
        Banco.desconectar();
        return leilao;
    }

    @Override
    public List<Leilao> listar(String criterio) 
            throws SQLException, 
            ClassNotFoundException {
        String sql = "SELECT * FROM genero ";

        if (criterio.length() != 0) {
            sql += "WHERE " + criterio;
        }

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //executar comando SQL
        rs = pst.executeQuery();
        List<Leilao> leiloes = new ArrayList<>();
        while (rs.next()) { //percorre todos os registros
            leilao = new Leilao();
            leilao.setCodGenero(rs.getInt("codGenero"));
            leilao.setDescricao(rs.getString("descricao"));
            leiloes.add(leilao);
        } 
        rs.close(); //fecha o resultSet
        Banco.desconectar();
        return leiloes;
    }

    @Override
    public Leilao proximo() 
            throws SQLException, ClassNotFoundException {

        String sql = "SELECT IFNULL(max(codGenero), 0) + 1 codigo "
                + "FROM genero";

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //executar comando SQL
        rs = pst.executeQuery();
        
        rs.next(); //lê o registro
        leilao = new Leilao();
        leilao.setCodGenero(rs.getInt("codigo"));
        rs.close(); //fecha o resultSet
        Banco.desconectar();
        return leilao;
        
    }
}