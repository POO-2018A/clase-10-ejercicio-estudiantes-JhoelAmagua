
package jjas;

public class Principal {
    
    public static void main(String[] args) {
        Estudiante [] estudiantes = new Estudiante [3];
        
        estudiantes [0]= new Estudiante ("Jhoel","Amagua","1723616486");
       
        int ma1=0;
        int ma2=0;
        int ma3=0; 
        int ma4=0;
        int ma5=0;
        
        String [] m0 = {"M1","M2"};
        estudiantes [0].setMaterias(m0);
        String [] materiasEstudiante1 = estudiantes[0].getMaterias(); 
        
        
        
        System.out.println("Estudiante 1: ");
        System.out.println("Nombre: "+estudiantes[0].getNombre()+" "+estudiantes[0].getApellido());
        System.out.println("Cedula: "+estudiantes[0].getCedula());
        System.out.println("Materias: ");
        for(int i=0; i<materiasEstudiante1. length; i++){
            int n=1+i;
            System.out.println(n +". "+materiasEstudiante1[i]);
            if(materiasEstudiante1[i].equals("M1")){
                ma1++;
            }
            if(materiasEstudiante1[i].equals("M2")){
                ma2++;
            }
}
        
        estudiantes [1]= new Estudiante ("Juan","Santana","1726584796");
        String [] m1 = {"M2","M3","M4"};
        estudiantes[1].setMaterias(m1);
        String [] materiasEstudiante2 = estudiantes[1].getMaterias();
        
        System.out.println("Estudiante 2: ");
        System.out.println("Nombre: "+estudiantes[1].getNombre()+" "+estudiantes[1].getApellido());
        System.out.println("Cedula: "+estudiantes[1].getCedula());
        System.out.println("Materias: ");
        for(int i=0; i<materiasEstudiante2.length; i++){
            int n=i+1;
            System.out.println(n+". "+materiasEstudiante2[i]);
            if(materiasEstudiante2[i].equals("M2")){
                ma2++;
            }
            if(materiasEstudiante2[i].equals("M3")){
                ma3++;
            }
            if(materiasEstudiante2[i].equals("M4")){
                ma4++;
            }
        }
        
        estudiantes [2]= new Estudiante ("David","Curipoma","1245789631");
        String [] m2 = {"M2","M3","M4","M5"};
        estudiantes[2].setMaterias(m2);
        String [] materiasEstudiante3 = estudiantes[2].getMaterias();
        
        System.out.println("Estudiante 3: ");
        System.out.println("Nombre: "+estudiantes[2].getNombre()+" "+estudiantes[2].getApellido());
        System.out.println("Cedula: "+estudiantes[2].getCedula());
        System.out.println("Materias: ");
        for(int i=0; i<materiasEstudiante3.length; i++){
            int n=i+1;
            System.out.println(n+". "+materiasEstudiante3[i]);
            if(materiasEstudiante3[i].equals("M2")){
                ma2++;
            }
            if(materiasEstudiante3[i].equals("M3")){
                ma3++;
            }
            if(materiasEstudiante3[i].equals("M4")){
                ma4++;
            }
            if(materiasEstudiante3[i].equals("M5")){
                ma5++;
            }
        }
        
        System.out.println("RESUMEN DE MATERIAS: ");
        System.out.println("M1: "+ma1);
        System.out.println("M2: "+ma2);
        System.out.println("M3: "+ma3);
        System.out.println("M4: "+ma4);
        System.out.println("M5: "+ma5);
        
    }
}
