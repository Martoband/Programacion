import utils.EdadInvalidaException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) throws EdadInvalidaException {
        Scanner scanner = new Scanner(System.in);
        int op1, op2, resultado;
        String op;
        System.out.println("Introduce el primer numero");
        op1 = scanner.nextInt();
        scanner.nextLine();
        boolean esCero = false;
        boolean noValido = false;
        System.out.println("Introduce el tipo de operacion: + , - , * , / ");
        op = scanner.nextLine();
        if (!op.equals("+")||!op.equals("-")||!op.equals("*")||!op.equals("/")){
            throw new EdadInvalidaException("Operando no valido");

        }else {


            do {
                try {
                    Scanner sc = new Scanner(System.in);//Se declara dentro porque se bucleaba sino
                    //he probado con el try resources y tampoco ha salido muy allá
                    System.out.println("Introduce el segundo numero");
                    op2 = sc.nextInt();
                    noValido = false;

                    switch (op) {
                        case "*" -> {
                            resultado = op1 * op2;
                            System.out.printf("Resultado: %d * %d = %d%n", op1, op2, resultado);
                        }
                        case "+" -> {
                            resultado = op1 + op2;
                            System.out.printf("Resultado: %d + %d = %d%n", op1, op2, resultado);
                        }
                        case "-" -> {
                            resultado = op1 - op2;
                            System.out.printf("Resultado: %d - %d = %d%n", op1, op2, resultado);
                        }
                        case "/" -> {
                            resultado = op1 / op2;
                            System.out.println("El resultado es " + resultado);
                            esCero = false;
                        }
                    }

                } catch (ArithmeticException e) {
                    System.out.println("No se puede dividir por cero");
                    esCero = true;
                } catch (NumberFormatException e) {
                    System.out.println("Introducir numeror válidos");
                    noValido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Introduce, al menos, numeros");
                    noValido = true;
                } finally {
                    System.out.println("Fin del programa");
                }
            } while (esCero || noValido);
        }//if else


    }//main
}//class
