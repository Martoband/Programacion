package SwitchFor;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println("Introduce un numero");
        num = sc.nextInt();
        int resultado=1;
        for(int i=num;i>0;i--){
            if (num!=i){System.out.printf("%d*%d ",resultado, i);
                resultado=i*resultado;
                System.out.printf(" = %d%n",resultado);
            }else{
                resultado=i*resultado;
               // System.out.printf("%d%n",resultado);
            }

        }
    }
}
