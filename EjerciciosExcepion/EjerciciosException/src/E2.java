import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        int usuario;
        boolean noExiste;
        Scanner sc = new Scanner(System.in);

           do{
               try {
                   System.out.println("Dime qué posicion quieres saber");
                   usuario = sc.nextInt();
                   System.out.println(num[usuario]);
                   noExiste = false;
               } catch (ArrayIndexOutOfBoundsException e) {
                   System.out.println("La posicion está fuera del array. Recuuerda que solo tiene 5 elementos");
                   noExiste = true;
               }
           }while(noExiste);
        }

        }

