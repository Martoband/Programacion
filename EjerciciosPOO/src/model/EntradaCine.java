package model;

public class EntradaCine {
    public String pelicula;
    public int sala;
    public double precio;

    public EntradaCine(){}
    public EntradaCine(String pelicula){
        this.pelicula=pelicula;
        this.sala=1;
        this.precio=7.5;
    }
    public EntradaCine(String pelicula, int sala, double precio){
        this.pelicula=pelicula;
        this.sala=sala;
        this.precio=precio;
    }
    public void datosCine (){//El nombre de esta variable no me convence
        System.out.printf("%s - Sala %s - %.1f€\n",pelicula, sala, precio);
    }
}
