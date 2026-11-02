import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op1, op2, resultado;
        System.out.println("Introduce el primer numero");
        op1 = sc.nextInt();
        boolean esCero;
        do {
            try {
                System.out.println("Introduce el segundo numero");
                op2 = sc.nextInt();
                resultado = op1 / op2;
                System.out.println("El resultado es " + resultado);
                esCero = false;
            } catch (ArithmeticException e) {
                System.out.println("Numero no válido");
                esCero=true;
            }
        }while (esCero);
    }
}
