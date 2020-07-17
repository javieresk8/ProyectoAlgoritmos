package Negocio;
public class Main {
    public static void main(String[] args) {
        
        Estudiantes est = new Estudiantes(10);
        Hash hash = new Hash(est.getApellidos());
        
        System.out.println(est.toString());
        System.out.println("La tabla de llaves son");
        
        hash.calcularClaves();
        System.out.println(hash.mostrarClaves());
        
        //hash.funcionHash();
        //System.out.println("La tabla hasheada es");
        //System.out.println(hash.mostrarHasheada());
        
       
        
    }
    
}
