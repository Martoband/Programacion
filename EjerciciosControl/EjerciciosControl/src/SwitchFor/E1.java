package SwitchFor;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = sc.nextInt();

        switch (num){
            case 1->{
                System.out.printf("El dia %d es lunes",num);
            } case 2->{
                System.out.printf("El dia %d es martes",num);
            } case 3->{
                System.out.printf("El dia %d es miercoles",num);
            } case 4->{
                System.out.printf("El dia %d es jueves",num);
            } case 5->{
                System.out.printf("El dia %d es viernes",num);
            } case 6->{
                System.out.printf("El dia %d es sabado",num);
            } case 7->{
                System.out.printf("El dia %d es domingo",num);
            }
        }

    }
}
