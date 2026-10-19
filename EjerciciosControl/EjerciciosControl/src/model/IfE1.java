package model;

import java.util.Scanner;

public class IfE1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int edad ;
        System.out.println("Introduce tu edad: ");
        edad = entrada.nextInt();
        entrada.close();
        if (edad>=18){
            System.out.println("Eres mayor de edad. puedes votar.");
        }
    }
}
