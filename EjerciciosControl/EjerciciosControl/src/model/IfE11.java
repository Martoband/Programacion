package model;

import java.util.Scanner;

public class IfE11 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double compra;
        boolean socio;
        System.out.println("Introduce el importe de la compra: ");
        compra = input.nextDouble();
        System.out.println("Eres socio?Introduce 'Y' o ' N'");
       // socio = input.nextBoolean();
        socio = input.next().equalsIgnoreCase("Y");
        double descuento = compra/10;
        input.close();
        System.out.printf("Importe original: %.2f%n",compra);
        System.out.printf("Eres socio? %b%n",socio);

        if(socio && compra>=200){
            System.out.printf("Eres socio y tu compra es >=200, %b %n",socio);
            System.out.println("Descuento aplicado (20%)"+ descuento*2);
            System.out.println("Importe final"+ (compra-(descuento*2)));
        }else if(socio && compra<200){
            System.out.printf("Eres socio y tu compra es <200, %b %n",socio);
            System.out.println("Descuento aplicado (10%) "+descuento);
            System.out.println("Importe final "+ (compra-descuento));
        }else if(!socio && compra>=300){
            System.out.printf("Eres socio: %b , Tu compra es >=300 %n",socio);
            System.out.println("Descuento aplicado (5%): "+descuento/2);
            System.out.println("Importe final: "+ (compra-(descuento/2)));
        }else{
            System.out.println("Pa lo que has gastao, haberte quedao en casa");
        }

        System.out.println("");

    }
}
