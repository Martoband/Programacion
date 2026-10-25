package EjerciciosClase;

import java.util.Scanner;

import static java.lang.Character.digit;

public class BaseImproved {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continua;
        boolean cambio;
        double suma = 0;
        double parcial;
        String num;
        boolean esTipo = false;
        int base;
        do {//ejecucion del programa
            System.out.println("Introduce la base del número: Binario, Octal o Hexadecimal (2,8,16) - 0 Para salir");
            base = sc.nextInt();
            sc.nextLine();
            while (base != 0 && base != 2 && base != 8 && base != 16 ) {
                System.out.println("Introduce la base correcta: Binario, Octal o Hexadecimal (2,8,16)");
                base = sc.nextInt();
                sc.nextLine();
            }//VERIFICACIÓN DE LA BASE

            switch (base) {
                case 2 -> System.out.println("Dime un numero EN BINARIO (solo validos 1 y 0)");
                case 8 -> System.out.println("Dime un numero EN OCTAL (solo validos del 0 al 7)");
                case 16 -> System.out.println("Dime un numero EN HEXADECIMAL (numeros y letras de A hasta F)");
                case 0 -> {
                    System.out.println("Fin del programa");
                    return;
                }
            }//eleccion de la base
            num = sc.nextLine();
                for (int i = 0; i < num.length(); i++) {
                    if (digit(num.charAt(i), base) < 17 && digit(num.charAt(i), base) >= 0) {
                        esTipo = true;
                        parcial = digit(num.charAt(i), base) * Math.pow(base, (num.length() - 1 - i));
                        System.out.println(digit(num.charAt(i), base) + "*16^" + (num.length() - 1 - i) + " = " + parcial);
                        suma += parcial;
                    } else {
                        esTipo = false;
                        break;
                    }//false
                }
            if (esTipo) {
                System.out.println("Suma total " + suma);
            } else {
                System.out.printf("No has introducido una base válida.");//Aunque lo marque como redundante, me interesa que no haya salto de línea con la siguiente impresión por consola.
            }
            suma = 0;
            System.out.println("¿Quieres continuar ?S/N");
            continua = sc.nextLine().equalsIgnoreCase("s");
            if (continua) {

            }
        } while (continua);
    }
}
