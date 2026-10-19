package model;

import java.util.Scanner;

public class IfE7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota;
        System.out.println("Introduce tu nota");
        nota = in.nextDouble();
        if(nota<0 || nota >10){
            System.out.println("Nota no válida");
        }else if(nota<=4){
            System.out.println("Tu calificacion es: Suspenso");
        }else if(nota<=6){
            System.out.println("Tu calificacion es: Aprobado");
        }else if(nota <=8){
            System.out.println("Tu calificacion es: Notable");
        }else if (nota<= 10){
            System.out.println("Tu calificacion es: Sobresaliente");
        }
    }
}
