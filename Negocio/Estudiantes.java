package Negocio;
public class Estudiantes {
    private String[] apellidos;

    public Estudiantes(int n) {
        this.apellidos = new String[n];
        this.apellidos[0] = "Ab";
        this.apellidos[1] = "Barrera";
        this.apellidos[2] = "Jaramillo";
        this.apellidos[3] = "Canar";
        this.apellidos[4] = "Exposito";
        
    }

    public String[] getApellidos() {
        return apellidos;
    }

    public void setApellidos(String[] apellidos) {
        this.apellidos = apellidos;
    }
    
    
    public void llenarEstudiantes(){
        
    }

    @Override
    public String toString() {
        String salida="";
        for(int i = 0; i<apellidos.length;i++){
            salida+=apellidos[i]+"\n";
        }
        return salida;
    }
    
    
}
