package Models;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author lucas
 */
public class leilaoModel extends UnicastRemoteObject{
    public LeilaoImp() throws RemoteException{ 
        super();
    } 
}
