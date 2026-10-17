package model;

public class Rectangulo {
    public double base;
    public double altura;

    public Rectangulo(){}
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    public Rectangulo(double base){
        this.base=base;
        this.altura=base;
    }//Cuadrado

    public void medidas (){
        System.out.printf("base %.1f - altura %.1f\n",base,altura);
    }

}
