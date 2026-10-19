package model;

import java.util.Scanner;

public class IfE5 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = in.nextInt();
        in.close();
        if(numero%2==0){
            System.out.printf("El numero %d es par %n",numero);
        }else {
            System.out.printf("El numero %d es impar %n", numero);
        }

    }
}
