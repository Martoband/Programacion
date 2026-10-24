package While;
import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEstudiantes;
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int nota5;
        int nota6;

        System.out.println("Estudiantes en clase");
        numEstudiantes = sc.nextInt();
        int i = 0;
        while(i<numEstudiantes){
            System.out.printf("Introduce la nota del $d estudiante",i+1);
           //nota(i+1) = sc.nextInt();
        }
    }
}
