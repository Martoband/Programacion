package SwitchFor;

import java.util.Scanner;
public class E10 {
    public static void main(String[] args) {
        boolean completado;
        String flexiones = "Flexiones";
        String abdominales = "Abdominales";
        String sentadillas = "Sentadillas";
        Scanner sc = new Scanner(System.in);
        int repeticiones;
        int ejercicio;
        System.out.println("Qué ejercicio quieres hacer?\n1 - Flexiones\n2 - Abdominales \n3 - Sentadillas");
        ejercicio = sc.nextInt();
        System.out.println("¿Cuantas repeticiones quieres hacer?");
        repeticiones = sc.nextInt();
int i;
int j = 1;

        for (i =1 ; i<=repeticiones-1; i++) {

            while (j!= 1 && j<=repeticiones) {
                System.out.println("¿Quieres cambiar de ejercicio?true/false");
                completado = sc.nextBoolean();
                if (completado) {
                    System.out.println("Qué ejercicio quieres hacer?\n1 - Flexiones\n2 - Abdominales \n3 - Sentadillas");
                    ejercicio = sc.nextInt();
                    System.out.println("¿Cuantas repeticiones quieres hacer?");
                    repeticiones = sc.nextInt();
                    i=1;
                    j=1;
                } else {

                    System.out.println("Repetición " + (j) + " Completada");

                    switch (ejercicio) {
                        case 1 ->
                            System.out.printf("Te quedan %d repeticiones de %s%n", repeticiones - j, flexiones);

                        case 2 ->
                            System.out.printf("Te quedan %d repeticiones de %s%n", repeticiones - j, abdominales);

                        case 3 -> System.out.printf("Te quedan %d repeticiones de %s%n", repeticiones - j, sentadillas);
                    }

                }
                j++;
                i++;
            }
            if (i>=repeticiones){
                System.out.println("Entrenamiento Finalizado");
            }else {
                System.out.println("Repetición " + (i) + " Completada");

                switch (ejercicio) {
                    case 1 ->
                        System.out.printf("Te quedan %d repeticiones de %s%n", repeticiones - i, flexiones);

                    case 2 ->
                        System.out.printf("Te quedan %d repeticiones de %s%n", repeticiones - i, abdominales);

                    case 3 ->
                        System.out.printf("Te quedan %d repeticiones de %s%n", repeticiones - i, sentadillas);

                }
            }
            j++;
        }
    }
}
