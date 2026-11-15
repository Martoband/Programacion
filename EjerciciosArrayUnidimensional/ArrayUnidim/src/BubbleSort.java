import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean arrayCreado = false;
        boolean intercambio = false;
        int menu, numero, submenu;
        numero = 0;
        int[] numeros=new int[0];
        int[] auxiliares=new int[0];

        do {
            System.out.println("----MENU----");
            System.out.println("1 - Rellenar Array con Aleatorios");
            System.out.println("2 - Crear Array Manual");
            System.out.println("3 - Volver a mostrar mensaje");
            System.out.println("4 - Salir");
            menu = sc.nextInt();
            if (menu != 4) {
                System.out.println("De cuantos numeros quieres el array");
                numero = sc.nextInt();

            }
            switch (menu) {
                case 1:
                    int alpha;
                    do {
                        System.out.println("Dime el factor de aleatoriedad(>2)");
                        alpha = sc.nextInt();
                    } while (alpha <= 1);
                    numeros = new int[numero];
                    for (int i = 0; i < numeros.length; i++) {
                        numeros[i] = (int) (Math.random() * (numero * alpha));
                    }
                    arrayCreado = true;
                    break;

                case 2:
                    numeros = new int[numero];
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.printf("Introduce la %d posición %n", (i + 1));
                        numeros[i] = sc.nextInt();
                    }
                    arrayCreado = true;
                    break;

                case 4:
                    break;
            }//switch MENU - RELLENAR
            if (arrayCreado && menu!=4) {
                do {//submenu - sorts
                    System.out.println("SUBMENU");
                    System.out.println("1 - Ordenar de forma Ascendente");
                    System.out.println("2 - Ordenar de forma Descendente");
                    System.out.println("3 - Pivotar sobre el centro");
                    System.out.println("4 - Invertir");
                    System.out.println("5 - Elegir otro array");
                    System.out.println("6 - Volver al menú principal");
                    submenu = sc.nextInt();

                    switch (submenu) {
                        case 1:
                            System.out.println("Has elegido  : Ordenar de forma Ascendente");
                           for (int i = 0; i < numeros.length; i++) {
                                int aux;
                                for (int j = 0; j < numeros.length - 1 - i; j++) {
                                    if (numeros[j] > numeros[j + 1]) {
                                        aux = numeros[j];
                                        numeros[j] = numeros[j + 1];
                                        numeros[j + 1] = aux;
                                        intercambio = true;
                                        if (!intercambio) {
                                            break;
                                        }
                                    }

                                }
                               System.out.println(Arrays.toString(numeros));
                            }
                            break;
                        case 2:
                            System.out.println("Has elegido  : Ordenar de forma Descendente");

                            for (int i = 0; i < numeros.length; i++) {
                                int aux;
                                for (int j = 0; j < numeros.length - 1 - i; j++) {
                                    if (numeros[j] < numeros[j + 1]) {
                                        aux = numeros[j];
                                        numeros[j] = numeros[j + 1];
                                        numeros[j + 1] = aux;
                                        intercambio = true;
                                        if (!intercambio) {
                                            break;
                                        }
                                    }
                                }
                            }
                            System.out.println(Arrays.toString(numeros));

                            break;
                        case 3:
                            //TODO PIVOTAR SOBRE EL CENTRO. Algo como dividir lenght /2, si es impar sumarle 1 a la posición.
                            System.out.println("Has elegido  : Pivotar");


                            for (int i = 0; i <numeros.length-1 ; i++) {


                            }
                            //System.out.println(Arrays.toString(numeros));

                            break;
                        case 4:

                            break;
                        case 5:
                            System.out.println("Has seleccionado atrás");

                            break;
                    }//Switch Submenu
                } while (submenu != 6);//SUBMENU

            }//if (arrayCreado) -> doWhile

        } while (menu != 4) ;//MENU GENERAL

    }
}//class



