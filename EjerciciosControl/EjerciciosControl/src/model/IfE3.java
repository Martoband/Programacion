package model;

import java.util.Scanner;

public class IfE3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double nota;
        System.out.println("Introduce tu nota: ");
        nota= teclado.nextDouble();
        if(nota<0 || nota>10){
            System.out.println("Esta vez entre 0 y 10, por favor. No te lo vuelvo a repetir");
        }
        nota= teclado.nextDouble();
        teclado.close();
        if(nota>=5 && nota<=10){
            System.out.println("¡Enhorabuena! ¡Has aprobado!");
        }else if (0<nota && nota<5) {
            System.out.println("¡Vaya! Has suspendido...");
        }else{
            System.out.println("Has introducido una nota erronea");
        }
    }
}
