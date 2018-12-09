package Models;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author lucas
 */
public interface Leilao extends Remote{
    public Usuario login(String user, String senha) throws RemoteException;
    public boolean inserir(String user, String email, String CPF, String senha, int Tipo) throws RemoteException;
    public boolean inserirItem(Item item) throws RemoteException;
    public boolean inserirLeilao(Leilaomodel leilaoModel) throws RemoteException;
    public boolean preencherLeilao(Leilaomodel leilaomodel) throws RemoteException;
}
