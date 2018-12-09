package Models;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
/**
 * @author lucas
 */
public interface Leilao extends Remote {
    public Usuario login(String user, String senha) throws RemoteException;
    public boolean inserir(String user, String senha, String nome, String CPF, int tipoAcc) throws RemoteException;
    public boolean inserirItem(Item item) throws RemoteException;
    public boolean inserirLeilao (Leilaomodel leilaoModel) throws RemoteException;
    public List<Leilaomodel> preencherLeilao(Leilaomodel leilaomodel) throws RemoteException;
}
