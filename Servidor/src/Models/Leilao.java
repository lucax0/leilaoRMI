package Models;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * @author lucas
 */
public interface Leilao extends Remote{
    public boolean login(String user, String senha) throws RemoteException;
    
}
