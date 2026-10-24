package While;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero");
        num = sc.nextInt();
        System.out.println("Cuenta atrás");
        while(num!=0){
            System.out.println(num);
            num--;
        }
        System.out.println("Despegue!");
    }
}
