package model;

public class Estudiante {
    public String nombre;
    public String curso;
    public boolean matriculado;

    public Estudiante(){}
    public Estudiante(String nombre, String curso){
        this.nombre=nombre;
        this.curso=curso;
    }
    public Estudiante(String nombre, String curso, boolean matriculado){
        this.nombre=nombre;
        this.curso=curso;
        this.matriculado=matriculado;
    }
    public void estadoMatricula(){
        System.out.printf("%s - %s - Matriculado: %b\n",nombre, curso, matriculado);

    }
}
