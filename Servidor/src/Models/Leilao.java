package Models;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * @author lucas
 */
public interface Leilao extends Remote {
    public Usuario login(String user, String senha) throws RemoteException;
    public boolean inserir(String user, String senha, String nome, String CPF, int tipoAcc) throws RemoteException;
    public boolean inserirItem(String nome, String vendedor, String CPF, String Descricao, float valormin, String senha, float arremate) throws RemoteException;
//    public boolean inserirLeilao(leilaoModel)
}
