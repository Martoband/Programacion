package While;
//Con doble validación para que si aciertas a la primera no se ejecute el do-while
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        String pass= "1234";
        boolean correcto;
        String entrada;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la contraseña");
        entrada=sc.nextLine();
        correcto = entrada.equals(pass);
        if(!correcto) {
            do {
                System.out.println("Intentalo de nuevo\nIntroduce la contraseña");
                entrada = sc.nextLine();
                correcto = entrada.equals(pass);
            } while (!correcto);
            System.out.println("Correcto!! Acceso permitido");
        }else {
            System.out.println("Correcto!! Acceso permitido");
        }
    }
}
