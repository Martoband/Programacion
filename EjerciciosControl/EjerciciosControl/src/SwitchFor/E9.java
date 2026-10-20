package SwitchFor;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println("Introduce un numero");
        num = sc.nextInt();
        int resultado=1;
        for(int i=0;i<=num+1;i++){
            resultado=resultado*(num*(num-1));

            System.out.println("vuelta "+i);
            System.out.println(resultado);
            num-=2;

        }
    }
}
