package model;

import java.util.Scanner;

public class IfE4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double compra;
        System.out.println("Introduce el importe de la compra: ");
        compra = input.nextDouble();
        double descuento = compra/10;
        input.close();
        System.out.printf("Importe original :%.2f €%n",compra);
        if(compra>100) {
            System.out.printf("Descuento aplicado: %.2f €%n", descuento);
            System.out.printf("Importe final %.2f € ", (compra - descuento));
        }else{
            System.out.println("Como no has gastado suficiente, no tienes descuento");
            System.out.printf("Importe final %.2f € ",compra);
        }
        }
    }
