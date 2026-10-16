package model;

public class Coche {
    public String marca;
    public String modelo;
    public int anio;

    public Coche (){
        this.marca="Sin marca";
        this.modelo="Sin modelo";
        this.anio=2000;
    }
    public Coche (String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
        this.anio=2026;
    }
    public Coche (String marca, String modelo, int anio){
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
    }
    public String getMarca(){
        return this.marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }




    /* public void muestraCoche(){
        System.out.printf("%s - %s - %d \n",marca, modelo, anio);
    }*/
}

