package model;
import java.util.Scanner;

//Este lo he hecho fuera de IntelliJ, así que igual tiene algun fallo de escritura
public class IfE13{

public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    int edad;
    int dia;
    String diaString;
    double precio=6;
    boolean menores;
    boolean adolescentes;
    boolean adultos;
    boolean esDia;
    boolean incremento = false;

    System.out.println("Introduce tu edad");
    edad = sc.nextInt();
    System.out.println("Introduce el dia de la semana (en numero):");
    System.out.println("1-Lunes\n2-Martes\n3-Miercoles\n4-Jueves\n5-Viernes\n6-Sabado\n7-Domingo");
    dia = sc.nextInt();
    sc.close();
    if (dia == 1) {
        diaString = "Lunes";
    } else if (dia == 2) {
        diaString = "Martes";
    } else if (dia == 3) {
        diaString = "Miercoles";
    } else if (dia == 4) {
        diaString = "Jueves";
    } else if (dia == 5) {
        diaString = "Viernes";
    } else if (dia == 6) {
        diaString = "Sabado";
    } else if (dia == 7) {
        diaString = "Domingo";
    } else {
        System.out.println("No has introducido un día válido. Precio duplicado");
        diaString = "Domingo";
        dia = 7;
        incremento = true;
    }
    System.out.println("Edad:" + edad);
    System.out.printf("Día de la semana: (%d) - %s ", dia, diaString);
    menores = edad < 12;
    adolescentes = edad > 12 && edad < 17;
    adultos = edad > 18 && edad < 64;
    esDia = dia == 2 || dia == 4;
    System.out.println("¿Eres menor de 12 años?" + menores);
    if (menores) {
        precio = 0;
    } else if (adolescentes) {
        System.out.println("¿Tienes entre 12 y 17 años?" + adolescentes);
        if (esDia) {
            System.out.println("¿Es martes?" + esDia);
            precio = 0;
        } else {
            System.out.println("¿Es martes?" + esDia);

        precio = 5;}
        if (incremento) {
            precio *= 2;
        }
    } else if (adultos) {
        System.out.println("¿Tienes entre 18 y 64 años?" + adultos);
        if (esDia) {
            System.out.println("¿Es jueves?" + esDia);
            precio = 7;
        } else {
            System.out.println("¿Es jueves?" + esDia);
        precio = 10;}

        if (incremento) {
            precio *= 2;
        } else {
            precio = 6;
            if (incremento) {
                precio *= 2;
            }
        }

    }
    if(incremento){
        System.out.printf("Precio de la entrada duplicado por trolear al sistema: %.2f€",precio);
    }else{
    System.out.printf("Precio de la entrada: %.2f, ",precio);
    }
}
}