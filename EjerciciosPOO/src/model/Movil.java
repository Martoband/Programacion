package model;

public class Movil {
    public String marca;
    public String modelo;
    public int almacenamiento;
    public boolean encendido;

    public Movil (){}
    public Movil (String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
        almacenamiento=64;
    }
    public Movil (String marca, String modelo, int almacenamiento){
        this.marca=marca;
        this.modelo=modelo;
        this.almacenamiento=almacenamiento;

    }
    public Movil (String marca, String modelo, int almacenamiento,boolean encendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.encendido=encendido;
        }

    public void estado(){
        System.out.printf("%s - %s - %d GB - Encendido: %b\n",marca,modelo,almacenamiento,encendido);
    }
    }
