package While;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aleatorio;
        int contador = 1;
        aleatorio = (int) (Math.random() * 10)+1;
        System.out.println(aleatorio);
        int usuario;
        System.out.println("Adivina un numero entre 1 y 10");
        usuario = sc.nextInt();
        if (usuario == aleatorio) {
            System.out.println("Enhorabuena! Al primer intento!!!");
        } else {
            do{
                contador++;
                if (usuario > aleatorio) {
                    System.out.println("Vaya! Tu número es mayor...Vuelve a probar");
                } else if (usuario < aleatorio) {
                    System.out.println("Venga ya! Tu numero es menor...Prueba de nuevo");
                }
                System.out.printf("Introduce tu %dº intento:%n", contador);
                usuario = sc.nextInt();

            } while (usuario != aleatorio) ;
        }
        System.out.printf("Correcto!!Has acertado el numero!, Sólo has necesitado %d intentos.", contador);
        //elseif
    }
}
