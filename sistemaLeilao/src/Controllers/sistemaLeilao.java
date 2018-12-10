package Controllers;
import Models.Item;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import Models.Leilao;
import Models.Leilaomodel;
import Models.Usuario;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Lucas
 */
public class sistemaLeilao{
  //Methodos do servidor
  public Leilao conectarServidor(){
      Leilao l = null;
      try {
            LocateRegistry.getRegistry("localhost");
            l = (Leilao) Naming.lookup("rmi://localhost:9999/LeilaoService");
            System.out.println("CONEXAO TRUE");
	} catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
	}        
        System.out.println(l.toString());
        return l;
  }

  public Usuario login(String user, String senha, Leilao server){      
      Usuario loginResult = null;
      try{        
          loginResult = server.login(user, senha);
      } catch (RemoteException e){
          e.printStackTrace();
      }
      return loginResult;
  }
  
  public boolean inserir(String user, String senha, String nome, String CPF, int tipo ,Leilao server){
      boolean cadastroResult = false;
      try {
          cadastroResult = server.inserir(user, senha, nome, CPF , tipo);
          return cadastroResult;
      } catch (Exception e) {
          System.out.println("Erro ao inserir:" +e);
      }
      return cadastroResult;
  }
  
  public boolean inserirItem(Item item ,Leilao server){
      boolean cadastroItemResult = false;
      try {
          cadastroItemResult = server.inserirItem(item);
          return cadastroItemResult;
      } catch (Exception e) {
          System.out.println("Erro ao inserir:" +e);
      }
      return cadastroItemResult;
  }
    public boolean inserirLeilao(Leilaomodel leilaoModel ,Leilao server){
      boolean cadastroLeilaoResult = false;
      try {
          cadastroLeilaoResult = server.inserirLeilao(leilaoModel);
          return cadastroLeilaoResult;
      } catch (Exception e) {
          System.out.println("Erro ao inserir:" +e);
      }
      return cadastroLeilaoResult;
  }
    public List<Leilaomodel> preencherleilao(String criterio ,Leilao server){
     List<Leilaomodel> leiloes;
        try {
          leiloes = server.preencherLeilao(criterio);
          return leiloes;
      } catch (Exception e) {
          System.out.println("Erro ao preencher:" +e);
      }
      return null;
  }
    public Leilaomodel pesquisarL(Leilao server){
        Leilaomodel leilao;
        try {
            leilao = server.pesquisarL();
            return leilao;
        } catch (Exception e) {
            System.out.println("Erro ao buscar leilao");
        }
        return null;
    }
  
    public boolean alterarStatuById(String criterio , Leilao server){
        boolean result = false;
        try {
            result = server.alterarStatusById(criterio);
            return result;
        } catch (Exception e) {
            System.out.println("Erro:" + e);
        }
        return result;
    }
}
