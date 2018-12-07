package Controllers;
import Models.leilaoModel;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
/**
 * @author Lucas
 */
public class sistemaLeilao{
  //Methodos do servidor
  public leilaoModel conectarServidor(){
      leilaoModel l = null;
      try {
            LocateRegistry.getRegistry("localhost");
            l = (leilaoModel) Naming.lookup("rmi://localhost:9000/LeilaoService" );
            System.out.println("CONEXAO TRUE");
	} catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
	}        
        return l;
  }

  public boolean login(String user, String senha, leilaoModel server){
      boolean loginResult = false;
      try{          
          loginResult = server.login(user, senha);
          System.out.println(loginResult);
      } catch (RemoteException e){
          e.printStackTrace();
      }
      return loginResult;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
