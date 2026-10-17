package model;
//Math.random.() -> numero entre 0 y 0.99999 periodo, si luego lo multiplicas por 101, tienes un numero entre 0 y 100,9999999
public class Persona {
    public String nombre;
    public int edad;

    public Persona(){}
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public void saludar(){
        System.out.printf("Hola, mi nombre es %s y tengo %d años\n", this.nombre, this.edad);
    }

}
