package While;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String saludar = "Buenos días a todos!";
        String despedirse = "Hasta luego!";
        String verHora = "Enseñar Hora en formato local";
        int usuario;


        do{
            System.out.println("--- MENÚ ---");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Ver Hora");
            System.out.println("4. Salir");
            System.out.println("Elige una opción");
            usuario = sc.nextInt();
if(usuario<1 || usuario>4){
    System.out.println("Elige una opción(Entre 1 y 4, por favor)");
    usuario = sc.nextInt();
}else{
            switch(usuario){
                case 1-> System.out.println(saludar);
                case 2-> System.out.println(despedirse);
                case 3-> System.out.println(verHora);

            }}



        }while(usuario!=4);
        System.out.println(">>Fin de programa<<");

    }
}
