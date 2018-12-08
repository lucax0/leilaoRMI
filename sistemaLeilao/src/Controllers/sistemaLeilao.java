package Controllers;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import Models.Leilao;
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

  public boolean login(String user, String senha, Leilao server){      
      boolean loginResult = false;
      try{        
          loginResult = server.login(user, senha);
//          System.out.println("resultado:" + loginResult);
      } catch (RemoteException e){
          e.printStackTrace();
      }
      return loginResult;
  }
  
  public boolean inserir(String user, String senha, String nome, String CPF, int tipoAcc ,Leilao server){
      boolean cadastroResult = false;
      try {
          cadastroResult = server.inserir(user, senha, nome, CPF , tipoAcc);
          return cadastroResult;
      } catch (Exception e) {
          System.out.println("Erro ao inserir:" +e);
      }
      return cadastroResult;
  }
  
}
