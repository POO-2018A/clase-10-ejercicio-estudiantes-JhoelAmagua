
package jjas;

public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String cedula;
    private String [] materias;
    
    public Estudiante (String nombre, String apellido, String cedula){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
}

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

     
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public static void main (String []args){
        
    
    }
}
