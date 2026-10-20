package SwitchFor;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a;
        int b;
        String operador;
        System.out.println("Introduce el OPERADOR(+,-,*,/)");
        operador = sc.nextLine();
        System.out.println("Introduce el primer numero");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        b = sc.nextInt();
        System.out.println("Introduce el OPERADOR(+,-,*,/)");
        operador = sc.nextLine();

        switch (operador){
            case "+"->{
                System.out.printf("Resultado: %d + %d = %d",a,b,a+b);
            }
            case "-"->{
                System.out.printf("Resultado: %d - %d = %d",a,b,a-b);
            }
            case "*"->{
                System.out.printf("Resultado: %d * %d = %d",a,b,a*b);
            }
            case "/"->{
                System.out.printf("Resultado: %d / %d = %d",a,b,a/b);
            }


        }

    }
}
