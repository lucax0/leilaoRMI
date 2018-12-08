package Models;

import DAO.UsuarioDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author lucas
 */
public class LeilaoImp extends UnicastRemoteObject implements Leilao {

    private boolean login;
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    public LeilaoImp() throws RemoteException {
        super();
    }

    @Override
    public boolean login(String email, String senha) throws RemoteException {
        try {
            Usuario usuario = usuarioDAO.login(email, senha);
            if (usuario != null) {
            System.out.println("SQL login deu certo");
            return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println("Falha no SQL de login:" + e);
        }
        return false;    }

    @Override
    public boolean inserir(String user, String senha, String nome, String CPF, int tipoAcc) throws RemoteException {
        try {
            Usuario usuario = new Usuario();
            usuario.setNome(nome);
            usuario.setCpf(CPF);
            usuario.setEmail(user);
            usuario.setTipo(1);
            usuario.setSenha(senha);
            if(usuarioDAO.inserir(usuario)){
                return true;
            }            
        } catch (Exception e) {
            System.out.println("Erro nao inserir:" + e);
        }
        return false;
    }
    
    

}
