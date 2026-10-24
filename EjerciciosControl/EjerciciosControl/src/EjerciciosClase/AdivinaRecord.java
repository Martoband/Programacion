package EjerciciosClase;

import java.util.Scanner;

public class AdivinaRecord {
    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    int aleatorio = (int)(Math.random()*21);
        System.out.println(aleatorio);
    boolean coincide=false;
    boolean seguir;
    int usuario;
    int contador =1;
    int record=0;
    int mejorRecord=1000;

    do {

        do {
            System.out.printf("Dime tu %d intento%n", contador);
            usuario = sc.nextInt();
            sc.nextLine();
            if (usuario == aleatorio) {
                coincide = true;
            } else {
                System.out.println("Lo siento, intentalo de nuevo");
                contador++;
            }
        } while (!coincide);

        if (contador < record && record != 0) {
            System.out.printf("Esta vez has superado el record anterior de %d%n", record);
        } else if (record != 0) {
            System.out.printf("Huy! Por poco no superado el record anterior de :%d%n", record);
        } else if (record == 0) {
            System.out.printf("Has acertado! Solo has necesitado %d intentos%n",contador);
        }
        record = contador;

        System.out.println("¿Quieres seguir Jugando?S/N");
        seguir=sc.nextLine().equalsIgnoreCase("s"); //si no es igual a "s", es falso;
        if(seguir){//Reiniciamos las casuisticas base
            contador=1;
            coincide =false;
            aleatorio = (int)(Math.random()*21);
            System.out.println(aleatorio);

        }if(record<mejorRecord){
            mejorRecord=record;
        }

    }while(seguir);
        System.out.printf("Enhorabuena, has acertado en %d intentos%n",record);
        System.out.printf("Tu mejor puntuación ha sido %d",mejorRecord);

    }
}
