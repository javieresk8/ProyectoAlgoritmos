package Negocio;
public class Hash {
    
    String[] apellidos;
    int[] claves;
    int[] hasheada;
    public Hash(String[] apellidos) {
        hasheada = new int[40];
        this.apellidos = new String[apellidos.length];
        this.apellidos = apellidos;
                
        this.claves = new int[apellidos.length];
    }
    
    //Metodo que convierte en claves los nombres de un arreglo y devueleve un arreglo de las claves a calcular
    
    public void calcularClaves(){
        
        for(int i = 0; i< apellidos.length; i++){
            if(apellidos[i]!= null){
                //Calculamos las claves, se transforma a ASCII y se suma p
                
                    int contador = 0;
                    char[] temporal = new char[apellidos[i].length()];
                     System.out.println("El apellido es"+apellidos[i]);
                    
                   temporal = apellidos[i].toCharArray();
                  
                    for(char letra: temporal){
                        contador+=letra;
                       
                    }
                    
                    this.claves[i] = contador;
                
            } else {
                this.claves[i] = -1;
            }
        }
        
    }
    
    public void funcionHash(){
         int i, indice;
         for (i=0; i < claves.length ; i++){
             int elemento = claves[i];
             indice = elemento%40;
             System.out.println("El indice de: "+elemento + " es " + indice);
             
             //Tratamiento de colisiones, prueba lineal
             while(claves[i]!=-1){
                indice++;
                System.out.println("Ocurrió una colisión en el indice " + (indice-1)+
                        " cambiar a índice " + indice);
                indice%=40;
                
            }
             this.hasheada[indice] = elemento;
         }
    }
    
    public String mostrarClaves(){
         String salida="";
        for(int i = 0; i<claves.length;i++){
            salida+=claves[i]+"\n";
        }
        return salida;
    }
    public String mostrarHasheada(){
         String salida="";
        for(int i = 0; i<hasheada.length;i++){
            salida+=hasheada[i]+"\n";
        }
        return salida;
    }
    
    
}
