package model;

public class Producto {
public String nombre;
public double precio;

    public Producto (){}
    public Producto (String nombre){
        this.nombre=nombre;
        this.precio=0.0;
    }
    public Producto (String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    public void datos(){
        System.out.printf("%s - %.2f € \n",nombre,precio);
    }


}
