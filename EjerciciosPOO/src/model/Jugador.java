package model;

public class Jugador {
    public String nombre;
    public int nivel;
    public int puntuacion;

    public Jugador(){}
    public Jugador(String nombre){
        this.nombre=nombre;
        this.nivel=1;
        this.puntuacion=0;
    }
    public Jugador(String nombre, int nivel){
        this.nombre=nombre;
        this.nivel=nivel;
        this.puntuacion=0;
    }
    public Jugador(String nombre, int nivel, int puntuacion){
        this.nombre=nombre;
        this.nivel=nivel;
        this.puntuacion=puntuacion;
    }

    public void estado(){
        System.out.printf("%s - Nivel %d - Puntuacion %d\n",nombre,nivel, puntuacion);
    }




}
