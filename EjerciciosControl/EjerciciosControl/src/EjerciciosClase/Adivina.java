package EjerciciosClase;

import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int aleatorio = (int)(Math.random()*21);
        System.out.println(aleatorio);
        boolean coincide=false;
        int usuario;
        int contador =1;
        do{
            System.out.printf("Dime tu %d intento%n",contador);
            usuario = sc.nextInt();
            if(usuario==aleatorio){coincide=true;}else{
                System.out.println("Lo siento, intentalo de nuevo");
                contador++;
            }
        }while(!coincide);
        System.out.printf("Enhorabuena, has acertado en %d intentos",contador);
}}
