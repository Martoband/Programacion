package EjerciciosClase;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int saldo =1000;
        int opcion;
        int operando;

        System.out.println("-- CAJERO AUTOMÁTICO --");
        System.out.printf("Saldo inicial: %d", saldo);


        do {
            System.out.println("--MENU--");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3.Depositar dinero");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion");
            opcion = sc.nextInt();
            sc.nextLine();
            while(opcion<1 || opcion>4){
                System.out.println("  -- FATAL ERROR --  ");
                System.out.println("Opcion no disponible\n");
                System.out.println("--MENU--");
                System.out.println("1. Consultar Saldo");
                System.out.println("2. Retirar dinero");
                System.out.println("3.Depositar dinero");
                System.out.println("4. Salir");
                System.out.println("Elige una opcion");
                opcion = sc.nextInt();
                sc.nextLine();
            }
            switch (opcion) {
                case 1 -> System.out.printf("Tu saldo actual es %d%n", saldo);
                case 2 -> {
                    System.out.println("¿Cuanto deseas retirar?");
                    operando = sc.nextInt();
                    sc.nextLine();
                    while (saldo < operando) {
                        System.out.printf("Fondos insuficientes, tu saldo es de %d%n", saldo);
                        System.out.println("¿Cuanto deseas retirar?");
                        operando = sc.nextInt();
                        sc.nextLine();
                    }
                    saldo -= operando;
                    System.out.printf("Has retirado %d€%n", operando);
                }//case2
                case 3-> {
                    System.out.println("¿Cuanto deseas depositar?");
                    operando = sc.nextInt();
                    sc.nextLine();
                    while (operando<0) {
                        System.out.printf("Cantidad negativa, no puedes ingresar %d%n", operando);
                        System.out.println("¿Cuanto deseas ingresar?");
                        operando = sc.nextInt();
                        sc.nextLine();
                    }
                    saldo+=operando;
                    System.out.printf("Has ingresado %d€%n",operando);
                }//case3
                }//Switch
        }while(opcion!=4);
        System.out.printf("Saldo Final : %d€%nHasta luego!",saldo);
    }
}
