package While;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int calificaciones;
        int i=0;
        double nota;
        double total=0;
        System.out.println("Cuantas calificaciones quieres introducir");
        calificaciones = sc.nextInt();

        while(i<calificaciones){
            System.out.printf("Introduce la %dª calificación ",i+1);
            nota = sc.nextDouble();
            total=total+nota;
            i++;
        }
        System.out.printf("Suma total = %.2f %n",total);
        System.out.printf("Promedio de calificaciones= %.2f ",(double)total/calificaciones);
    }
}
