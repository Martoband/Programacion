package EjerciciosClase;

import java.util.Scanner;

import static java.lang.Character.digit;

public class BaseDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cambio;
        double suma = 0;
        double parcial;
        String num;
        boolean esTipo = false;
        int base;

        do { //inicio del bucle-programa
            System.out.println("Introduce la base del número: Binario, Octal o Hexadecimal (2,8,16) - 0 Para salir");
            base = sc.nextInt();
            sc.nextLine();
            while (base != 0 && base != 2 && base != 8 && base != 16) {
                System.out.println("Introduce la base correcta: Binario, Octal o Hexadecimal (2,8,16)");
                base = sc.nextInt();
                sc.nextLine();
            }//VERIFICACIÓN DE LA BASE
            switch (base) {
                case 2 -> {//binario
                    do {
                        System.out.println("Dime un numero EN BINARIO (solo validos 1 y 0)");
                        num = sc.nextLine();
                        for (int i = 0; i < num.length(); i++) {
                            if (num.charAt(i) != '0' && num.charAt(i) != '1') {
                                esTipo = false;
                                break;
                            } else {
                                esTipo = true;
                                parcial = (num.charAt(i) - '0') * Math.pow(2.0, (num.length() - 1 - i));
                                System.out.println(num.charAt(i) + "*2^" + (num.length() - 1 - i) + " = " + parcial);
                                System.out.printf("%.0f + %.0f = %.0f%n%n", suma, parcial, suma + parcial);
                                suma += parcial;
                            }
                        }
                        if (esTipo) {
                            System.out.println("Suma total " + suma);
                        } else {
                            System.out.printf("No has introducido una base válida.");//Aunque lo marque como redundante, me interesa que no haya salto de línea con la siguiente impresión por consola.
                        }
                        suma = 0;
                        System.out.println("¿Quieres cambiar de base?S/N");
                        cambio = sc.nextLine().equalsIgnoreCase("s");
                        if (cambio) {

                            break;
                        }
                    } while (!cambio);

                }//binario


                case 8 -> {//octal
                    do {
                        System.out.println("Dime un numero EN OCTAL (solo validos del 0 al 7 )");
                        num = sc.nextLine();
                        for (int i = 0; i < num.length(); i++) {
                            if (num.charAt(i) < '0' || num.charAt(i) > '7') {
                                esTipo = false;
                                break;
                            } else {
                                esTipo = true;
                                parcial = (num.charAt(i) - '0') * Math.pow(8.0, (num.length() - 1 - i));
                                System.out.println(num.charAt(i) + "*2^" + (num.length() - 1 - i) + " = " + parcial);
                                System.out.printf("%.0f + %.0f = %.0f%n%n", suma, parcial, suma + parcial);
                                suma += parcial;
                            }
                        }
                        if (esTipo) {
                            System.out.println("Suma total " + suma);
                        } else {
                            System.out.printf("No has introducido una base válida.");//Aunque lo marque como redundante, me interesa que no haya salto de línea con la siguiente impresión por consola.
                        }
                        suma = 0;
                        System.out.println("¿Quieres cambiar de base?S/N");
                        cambio = sc.nextLine().equalsIgnoreCase("s");
                        if (cambio) {
                            break;
                        }
                    } while (!cambio);


                }//octal
                case 16 -> {
                    do {
                        System.out.println("Dime un numero EN HEXADECIMAL (NUMEROS Y LETRAS DE A - F)");
                        num = sc.nextLine();
                        for (int i = 0; i < num.length(); i++) {
                            if (digit(num.charAt(i), 16)<17 && digit(num.charAt(i), 16)>=0) {
                                esTipo = true;
                                parcial = digit(num.charAt(i), 16) * Math.pow(16.0, (num.length() - 1 - i));
                                System.out.println(digit(num.charAt(i), 16) + "*16^" + (num.length() - 1 - i) + " = " + parcial);
                                suma+=parcial;

                            }
                            else {
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
                        System.out.println("¿Quieres cambiar de base?S/N");
                        cambio = sc.nextLine().equalsIgnoreCase("s");
                        if (cambio) {
                            break;
                        }
                    } while (!cambio);



                }//hexadecimal

            }//switch

        } while (base != 0);

    }
}
