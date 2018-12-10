package DAO;

import Models.Item;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class ItemDAO implements DAO<Item>{
    private PreparedStatement pst;
    //Para conter o resultado de um SELECT
    private ResultSet rs;
    //Para representar um objeto
    private Item itemModel;

    @Override
    public boolean inserir(Item obj)throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO Item (idLeilao,nome, vendedor, cpf, descricao, valormin, senha, valorarremate, lance) values ( ?, ?, ?, ?, ?, ?, ?, ?,?)";

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //preencher os parametros do SQL
        pst.setInt(1, obj.getIdLeilao());
        pst.setString(2, obj.getNome());
        pst.setString(3, obj.getVendedor());
        pst.setString(4, obj.getCpf());
        pst.setString(5, obj.getDescricao());
        pst.setFloat(6, obj.getValormin());
        pst.setString(7, obj.getSenha());
        pst.setFloat(8, obj.getArremate());
        pst.setFloat(9, obj.getValormin());
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
    public boolean alterar(Item obj) throws SQLException,
            ClassNotFoundException {

        String sql = "UPDATE Item SET valormin = ? "
                + "WHERE " ;

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //preencher os parametros do SQL
        pst.setInt(1, (int) obj.getValormin());
        pst.setInt(2, obj.getId());
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
    public boolean excluir(Item obj)
            throws SQLException, ClassNotFoundException {

        String sql = "DELETE FROM Item WHERE id = ?";

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //preencher os parametros do SQL
        pst.setInt(1, obj.getId());
        
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
    public Item pesquisar(Item obj)
            throws SQLException, ClassNotFoundException {

        String sql = "SELECT * FROM Leilao "
                + "WHERE id = ?";

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //preencher os parametros do SQL
        pst.setInt(1, obj.getId());
        //executar comando SQL
        rs = pst.executeQuery();
        //verifica se encontrou o genero
        if (rs.next()) { //encontrou
            itemModel = obj;
            itemModel.setNome(rs.getString("nome"));
            itemModel.setDescricao(rs.getString("descricao"));
        } else {
            itemModel = null;
        }
        rs.close(); //fecha o resultSet
        Banco.desconectar();
        return itemModel;
    }

    @Override
    public List<Item> listar(String criterio) 
            throws SQLException, 
            ClassNotFoundException {
        String sql = "SELECT * FROM Item ";
        String div[] = criterio.split("=");
        String valId = div[1];
        if (criterio.length() != 0) {
            sql += "WHERE idLeilao =" + valId;
        }

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //executar comando SQL
        rs = pst.executeQuery();
        List<Item> items = new ArrayList<>();
        while (rs.next()) { //percorre todos os registros
            itemModel = new Item();
            itemModel.setId(rs.getInt("id"));
            itemModel.setNome(rs.getString("nome"));
            itemModel.setValormin(rs.getInt("valormin"));
            itemModel.setDescricao(rs.getString("descricao"));
            itemModel.setArremate(rs.getInt("valorarremate"));
            items.add(itemModel);
        } 
        rs.close(); //fecha o resultSet
        Banco.desconectar();
        return items;
    }

    @Override
    public Item proximo() 
            throws SQLException, ClassNotFoundException {

        String sql = "SELECT IFNULL(max(id), 0) + 1 codigo "
                + "FROM Item";

        //abre o banco
        Banco.conectar();
        pst = Banco.getConexao().prepareStatement(sql);
        //executar comando SQL
        rs = pst.executeQuery();
        
        rs.next(); //lê o registro
        itemModel = new Item();
        itemModel.setId(rs.getInt("id"));
        rs.close(); //fecha o resultSet
        Banco.desconectar();
        return itemModel;
        
    }
}