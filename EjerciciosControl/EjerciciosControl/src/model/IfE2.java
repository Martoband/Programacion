package model;

import java.util.Scanner;

public class IfE2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero ;
        System.out.println("Dime un entero");
        numero = in.nextInt();
        in.close();
        if(numero>0){
            System.out.printf("El numero %d es positivo %n",numero);
        }else if(numero<0){
            System.out.printf("El numero %d es negativo %n",numero);
        }else{
            System.out.printf("El numero es %d",numero);
        }
    }
}
