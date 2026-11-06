import utils.EdadInvalidaException;

public class Persona {
    private String nombre;
    private int edad;


    public Persona (){};
    public Persona (String nombre, int edad)throws EdadInvalidaException{
        this.nombre=nombre;
        do{
            if (edad<0){
            throw new EdadInvalidaException("Edad no válida. No ha nacido");
        }else{
                this.edad=edad;
        }
        }while(edad<0);

        }//Persona




    }

