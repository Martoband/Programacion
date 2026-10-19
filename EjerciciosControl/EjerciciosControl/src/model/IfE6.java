package model;

import java.util.Scanner;

public class IfE6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad;
        System.out.println("Introduce tu edad");
        edad = in.nextInt();

        if(edad>16 && edad<90){
            System.out.println("Acceso permitido");
        }else if(edad>0 && edad<16){
            System.out.println("Acceso denegado. Debes tener al menos 16 años.");
        }else if(edad<0){
            System.out.println("Debes haber nacido para entrar");
        }else{
            System.out.println("Te has pasado de frenada echando números. Vuelve a probar");
        }
    }
}
