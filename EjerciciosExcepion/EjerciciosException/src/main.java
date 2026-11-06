import java.util.Scanner;
import utils.EdadInvalidaException;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;

        System.out.println("Dime un nombre");
        nombre=sc.nextLine();
        System.out.println("Dime la edad");
        edad=sc.nextInt();

        try {
            Persona andreu = new Persona(nombre, edad);
            System.out.println("Persona creada correctamente");
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }

}
