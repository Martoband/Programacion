package While;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        boolean contador = false;

        do{
            if(contador){
                System.out.println("Edad no válida.Debe estar entre 0 y 120");
            }
            System.out.println("Introduce tu edad");
            edad = sc.nextInt();

            contador=true;
        }while(edad<0 || edad>120);
        System.out.printf("Edad válida.%d años. Gracias", edad);
    }
}
