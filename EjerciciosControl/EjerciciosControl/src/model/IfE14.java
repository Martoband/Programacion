package model;

import java.util.Scanner;

public class IfE14 {
    public static void main(String[] args) {
        int edad=0;
        double nomina=0;
        boolean anios;
        boolean ingresos;
        boolean libreDeudas;
        boolean elegible;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        edad=sc.nextInt();
        System.out.println("Introduce tus ingresos mensuales");
        nomina=sc.nextDouble();
        System.out.println("¿Tienes deudas pendientes? 'S' / 'N'");
        libreDeudas=sc.next().equalsIgnoreCase("n");//para darle más veracidad a la aplicación, en lugar de usar nextBoolean
        System.out.println("\n\n");
        anios = edad>20 && edad<65;
        ingresos = nomina>=1000;
                elegible = anios&& ingresos && libreDeudas ;
        System.out.printf("¿Edad entre 21 y 65?: %b (%d)%n",anios,edad);
        System.out.printf("¿Ingresos >= 1000€ ?: %b (%.2f)%n",ingresos,nomina);
        System.out.println("¿Sin deudas pendientes?:"+libreDeudas);
        System.out.println("¿Es elegible para el préstamo?: "+elegible);
        if(elegible){
            System.out.println("Enhorabuena! Eres elegible para solicitar el préstamo");
        }else if (!anios){
            System.out.println("Lo sentimos, no cumples los requisitos de edad");
        }else if(!ingresos){
            System.out.println("Lo sentimos, no cumples los requisitos económicos");
        }else if (!libreDeudas){
            System.out.println("Lo sentimos, no estás libre de deudas");
        }


    }
}
