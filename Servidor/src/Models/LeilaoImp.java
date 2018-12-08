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

}
