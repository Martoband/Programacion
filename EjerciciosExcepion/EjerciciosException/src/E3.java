import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        String numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        boolean noValido;
        do {
            try {
                numero = sc.nextLine();
                Integer.parseInt(numero);
                noValido = false;
                System.out.println("Has introducido "+numero);
            } catch (NumberFormatException e) {
                System.out.println("Error: Eso no es un numero válido, intentalo de nuevo.");
                noValido = true;
            }
        }while(noValido);



    }//main
}//class
