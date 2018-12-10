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
    public boolean atualizarItem(Item item) throws RemoteException;
    public boolean inserirLeilao (Leilaomodel leilaoModel) throws RemoteException;
    public List<Leilaomodel> preencherLeilao(String criterio) throws RemoteException;
    public List<Item> preencherItem(String criterio) throws RemoteException;
    public Leilaomodel  pesquisarL() throws RemoteException;
    public boolean alterarStatusById(String criterio) throws RemoteException;
}
