import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String buscar;
        int contadorBuscar=0;
        int contadorContiene=0;
        int contadorAbsoluto=0;
        System.out.println("De cuantos textos quieres el array");
        int x = sc.nextInt();
        sc.nextLine();
        String[] textos = new String[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Dime tu " + (i + 1) + "º texto");
            textos[i] = sc.nextLine();
        }//for
        System.out.println("Introduce la palabra a buscar");
        buscar= sc.nextLine();
        for(String palabra : textos){
            int posicion=0;
            if(palabra.equalsIgnoreCase(buscar)){
                contadorBuscar++;
            }if(palabra.contains(buscar)){
                contadorContiene++;
            }
            while(palabra.indexOf(buscar, posicion)!=-1){
                contadorAbsoluto++;
                posicion=palabra.indexOf(buscar,posicion) + buscar.length();
            }
        }
        System.out.printf("El texto '%s' aparece de forma individual %d veces",buscar,contadorBuscar);
        System.out.printf("El texto '%s' está contenido %d veces",buscar,contadorContiene);
        System.out.printf("El texto '%s' aparece de forma absoluta %d veces",buscar,contadorAbsoluto);



    }
}
