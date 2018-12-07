package Models;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author lucas
 */
public class LeilaoImp extends UnicastRemoteObject implements Leilao{
    private boolean login;
 
public LeilaoImp() throws RemoteException{ 
        super();
    }

    @Override
    public boolean login(String user, String senha) throws RemoteException {
        System.out.println("Caiu Aqui");
        if(user.equals("lucas") && senha.equals("123")){
            return true;
        }
        return false;
    }
    
}

