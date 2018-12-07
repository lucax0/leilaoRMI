package Controllers;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
/**
 * @author lucas
 */
public class ServidorLeilao {
    public static void main(String[] args) {
    }
    
    public ServidorLeilao(){
        try {
            //registra o servidor evitando de faze-lo  no console
            LocateRegistry.createRegistry(9000);
            Naming.rebind("rmi://localhost:9000/Leilao", m);		
	} catch( Exception e ) {
            System.out.println(" Erro: " + e );
	}
    }
    
}
