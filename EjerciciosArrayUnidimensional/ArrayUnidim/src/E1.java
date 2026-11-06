import utils.FrutaException;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        int num, cantidad;
        String color, nombre;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas frutas diferentes quieres");
        num=sc.nextInt();
        sc.nextLine();

        Fruta [] frutas = new Fruta[num];
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("¿Qué fruta es?");
            nombre = sc.nextLine();
            System.out.println("¿De qué color es?");
            color = sc.nextLine();
            System.out.println("¿Cuantas unidades hay?");
            cantidad = sc.nextInt();
            sc.nextLine();

            try{
               frutas[i] = new Fruta(nombre,color,cantidad);
            } catch (FrutaException e) {
                System.out.println(e.getMessage());
            }

        }
        for (Fruta miFruta: frutas){
            try{
                System.out.println(miFruta.getTipo());
            System.out.println(miFruta.getColor());
            System.out.println(miFruta.getCantidad());} catch (NullPointerException e) {
                System.out.println("No quisiste las uvas");
            }
        }
    }
}
