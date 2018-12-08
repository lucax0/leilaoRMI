package Models;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author lucas
 */
public interface Leilao extends Remote{
    public boolean login(String user, String senha) throws RemoteException;
    public boolean inserir(String user, String email, String CPF, String senha, int Tipo) throws RemoteException;
    public boolean inserirItem(String nome, String vendedor, String CPF, String Descricao, float valormin, String senha, float arremate) throws RemoteException;
}
