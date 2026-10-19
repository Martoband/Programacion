package model;

import java.util.Scanner;

public class IfE9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double altura;
        double peso;
        System.out.println("Introduce tu peso en kg");
        peso= in.nextDouble();
        System.out.println("Introduce tu altura en metros");
        altura= in.nextDouble();
        in.close();
        double IMC= peso/ Math.pow(altura,2);
        if (IMC<18.5){
            System.out.println("Estás por debajo del peso normal");
        }else if (IMC>24.9){
            System.out.println("Estás por encima del peso normal");
        }else{
            System.out.println("Estás en peso normal");
        }

    }
}
