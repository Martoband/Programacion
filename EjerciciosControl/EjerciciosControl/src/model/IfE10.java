package model;


import java.util.Scanner;

public class IfE10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int altura;
        System.out.println("Introduce tu altura en cm");
        altura = in.nextInt();
        if(altura<120 && altura>0){
            System.out.println("No puedes subir a la atracción. Altura minima 120cm");
        }else if(altura>200){
            System.out.println("No puedes subir a la atracción. Altura máxima 200cm");
        }else if (altura<0){
            System.out.println("Deja de darme números negativos, copón");
        }else{
            System.out.println("TODOS ABORDO!!!");
        }

    }
}
