package Controllers;

import Models.Leilao;
import Models.LeilaoImp;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor {
    
    public static void main(String[] args){
        try {
	System.out.print("Servidor escutando...\n");
	new Servidor();  
        } catch (Exception e) {
            System.out.println("Falha ao inicializar");  
        }
    }
    
    public Servidor(){
        try {
            Leilao m = new LeilaoImp();
            //registra o servidor evitando de faze-lo  no console
            LocateRegistry.createRegistry(9999);
            Naming.rebind("rmi://localhost:9999/LeilaoService", m);		
	} catch( Exception e ) {
            System.out.println(" Erro: " + e );
	}
    }
}
