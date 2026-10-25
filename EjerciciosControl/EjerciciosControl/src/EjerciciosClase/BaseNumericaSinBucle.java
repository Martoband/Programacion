package EjerciciosClase;

import java.util.Scanner;

import static java.lang.Character.digit;

public class BaseNumericaSinBucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bite;
        char hexa;
        int numUsuario;
        int exponente;
        String num="";
        int base;
        System.out.println("dime tu numero");
        numUsuario =sc.nextInt();
        sc.nextLine();
        System.out.println("Dime tu base");
        base = sc.nextInt();
        sc.nextLine();

        exponente = (int)(Math.log(numUsuario)/Math.log(base));
        System.out.println(exponente);
        for (int i = 0; i <= exponente; i++) {
            System.out.println("numUsuario = "+numUsuario);
            bite =numUsuario%base;
            hexa = Character.toUpperCase(Character.forDigit(bite, base));
            numUsuario/=base;
            System.out.println("nuevo NumUsuario = "+numUsuario);
            System.out.println(+i+" bite = "+bite);
            num = hexa+num;
            System.out.println(num);

        }

    }
}
