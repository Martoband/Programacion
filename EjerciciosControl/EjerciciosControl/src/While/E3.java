package While;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum;
        System.out.println("Introduce un número (0 o negativo para terminar)");
        num = sc.nextInt();
        sum=num;
        while(num>=0){
            System.out.printf("Suma actual actual = %d%n",sum);
            System.out.println("Introduce un número (0 o negativo para terminar)");
            num = sc.nextInt();
           if(num>0){sum+=num;}//para no restar los negativos
        }
        System.out.printf("Fin del programa. Suma total = %d", sum);
    }
}
