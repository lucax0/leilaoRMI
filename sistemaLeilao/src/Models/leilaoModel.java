package Models;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author lucas
 */
public interface leilaoModel extends Remote{
    public boolean login(String user, String senha) throws RemoteException;
    
}
