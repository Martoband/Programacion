package model;

import java.util.Scanner;

public class IfE12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String restringed1 = "12345678";
        String restringed2 = "password";
        String contrasenia;
        System.out.println("Dime una contraseña");
        contrasenia=sc.nextLine();

        boolean ocho=false;
        boolean contiene= contrasenia.contains("0")||
                contrasenia.contains("1")||
                contrasenia.contains("2")||
                contrasenia.contains("3")||
                contrasenia.contains("4")||
                contrasenia.contains("5")||
                contrasenia.contains("6")||
                contrasenia.contains("7")||
                contrasenia.contains("8")||
                contrasenia.contains("9");

        boolean prohibida=false;
        boolean valida=false;

        if(contrasenia.length()>=8){ocho=true;}
        if(contrasenia!=restringed2 || contrasenia!=restringed1){
            prohibida=true;
        }
        if(ocho && prohibida && contiene){
            valida=true;
        }
        System.out.println("¿Tiene al menos 8 caracteres? " +ocho);
        System.out.println("¿Contiene al menos 1 numero? " +contiene);
        System.out.println(("Es una contraseña prohibida?: "+prohibida));
        System.out.println("Es una contraseña válida? " +valida );




    }
}
