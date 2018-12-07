package Controllers;

import Models.Leilao;
import Models.LeilaoImp;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor {
    
    public static void main(String[] args){
	System.out.print("Servidor escutando...\n");
	new Servidor();
    }
    
    public Servidor(){
        try {
            Leilao m = new LeilaoImp();
            //registra o servidor evitando de faze-lo  no console
            LocateRegistry.createRegistry(9000);
            Naming.rebind("rmi://localhost:9000/LeilaoService", m);		
	} catch( Exception e ) {
            System.out.println(" Erro: " + e );
	}
    }
}
