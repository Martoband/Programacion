package model;

import java.util.Scanner;

public class IfE8 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("Introduce el primer numero");
        num1 = in.nextDouble();
        System.out.println("Introduce el segundo numero");
        num2 = in.nextDouble();

        if (num1>num2) {
            System.out.printf("El primer numero (%.2f) es mayor que el segundo (%.2f)%n", num1, num2);
        }else if(num2>num1){
            System.out.printf("El segundo numero ( %.2f) es mayor que el primero (%.2f)%n",num2, num1);
        }else{
            System.out.printf("El numero %.2f y el numero %.2f son iguales ",num1, num2);     }
    }
}
