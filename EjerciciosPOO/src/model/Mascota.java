package model;

public class Mascota {
    public String nombre;
    public String especie;
    public int edad;

    public Mascota (){}
    public Mascota (String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void datos(){
        System.out.printf("%s - %s - %d \n",this.nombre, this.especie,this.edad);
    }
}
