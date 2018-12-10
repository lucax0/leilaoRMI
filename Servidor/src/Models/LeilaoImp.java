package Models;

import DAO.LeilaoDAO;
import DAO.ItemDAO;
import DAO.UsuarioDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 * @author lucas
 */
public class LeilaoImp extends UnicastRemoteObject implements Leilao {

    UsuarioDAO usuarioDAO = new UsuarioDAO();
    ItemDAO itemDAO = new ItemDAO();
    LeilaoDAO leilaoDAO = new LeilaoDAO();

    public LeilaoImp() throws RemoteException {
        super();
    }

    @Override
    public Usuario login(String user, String senha) throws RemoteException {
            Usuario usuario = new Usuario();
        try {
            usuario = usuarioDAO.login(user, senha);
            if (usuario != null) {
                System.out.println("SQL login deu certo");
                return usuario;
            }
            return usuario;
        } catch (Exception e) {
            System.out.println("Falha no SQL de login:" + e);
        }
        return usuario;
    }

    @Override
    public boolean inserir(String user, String senha, String nome, String CPF, int tipoAcc) throws RemoteException {
        try {
            Usuario usuario = new Usuario();
            usuario.setNome(nome);
            usuario.setCpf(CPF);
            usuario.setEmail(user);
            usuario.setTipo(tipoAcc);
            usuario.setSenha(senha);
            if (usuarioDAO.inserir(usuario)) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Erro nao inserir:" + e);
        }
        return false;
    }

    @Override
    public boolean inserirItem(Item item) throws RemoteException {
        try {
            if (itemDAO.inserir(item)) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Erro nao inserir:" + e);
        }
        return false;
    }

    @Override
    public boolean inserirLeilao(Leilaomodel leilaoModel) throws RemoteException {
        try {
            if(leilaoDAO.inserir(leilaoModel)){
                System.out.println("Salvou Leilao");
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            System.out.println("Erro:" + e);
        }
        return false;
    }

    @Override
    public List<Leilaomodel> preencherLeilao(String criterio) throws RemoteException {
        try {
            List<Leilaomodel> leiloes;
            leiloes = leilaoDAO.listar(criterio);
            return leiloes;
        } catch (Exception e) { 
            System.out.println("Erro na busca de ");
        }
        return null;
    }

    @Override
    public Leilaomodel pesquisarL() throws RemoteException {
        try {
            Leilaomodel leilao2 = new Leilaomodel();
            Leilaomodel leilao = leilaoDAO.pesquisar(leilao2);
            return leilao;
        } catch (Exception e) {
            System.out.println("Erro na busca do ultimo leilao(IMP)");
        }
        return null;
    }
}
