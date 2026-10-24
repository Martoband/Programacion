package While;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int conteo=1;
        System.out.println("Dime un numero");
        num = sc.nextInt();
        while(conteo<=num){
            System.out.println(conteo);
            conteo+=1;
        }
    }
}
