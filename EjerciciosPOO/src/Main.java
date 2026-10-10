import model.*;

public class Main {
    public static void main (String args[]) {


        Persona ana = new Persona ("Ana",20);
        ana.saludar();



        Mascota toby = new Mascota("Toby", "Perro" , 5);
        Mascota wiskas = new Mascota("Wiskas", "Gato", 7);
        toby.datos();
        wiskas.datos();


        Libro libro1 = new Libro();
        Libro libro2 = new Libro("El principito","Antoine de Saint-Exupéry",96);
        libro1.informacion();
        libro2.informacion();


        Producto mochila = new Producto("Mochila", 25.5);
        Producto cuaderno = new Producto("Cuaderno");
        cuaderno.datos();
        mochila.datos();




    Coche sn = new Coche();
    Coche toyota = new Coche("Toyota","Corolla");
    Coche seat =new Coche ("Seat","Ibiza",2020);

        System.out.printf("Coche 1: ");
        sn.muestraCoche();
        System.out.printf("Coche 2: ");
        toyota.muestraCoche();
        System.out.printf("Coche 3: ");
        seat.muestraCoche();



   Estudiante alexis = new Estudiante("Alex","1º DAM");
   Estudiante sara = new Estudiante("Sara","1º DAM",true);
        System.out.printf("Estudiante 1: ");
        alexis.estadoMatricula();
        System.out.printf("Estudiante 2: ");
        sara.estadoMatricula();



  Rectangulo r1 = new Rectangulo(5.0,3.0);
  Rectangulo c1 = new Rectangulo(4);

        System.out.printf("Rectángulo: ");
        r1.medidas();
        System.out.println("Área del rectángulo: " + r1.base*r1.altura);
        System.out.printf("Cuadrado: ");
        c1.medidas();
        System.out.println("Área del cuadrado: " + c1.base*c1.altura);



    EntradaCine toyStory = new EntradaCine("Toy Story");
    EntradaCine encanto = new EntradaCine("Encanto",3,8.5);
        System.out.printf("Entrada 1: ");
        toyStory.datosCine();
        System.out.printf("Entrada 2: ");
        encanto.datosCine();
        System.out.println("Total de las entradas: "+ (toyStory.precio+encanto.precio));


    Jugador alex = new Jugador("Alex");
    Jugador dani = new Jugador("Dani",3);
    Jugador cris = new Jugador("Cris",5,200);
        System.out.print("Jugador 1: ");
        alex.estado();
        System.out.print("Jugador 2: ");
        dani.estado();
        System.out.print("Jugador 3: ");
        cris.estado();

        alex.puntuacion+=50;

        System.out.println("\n\nPuntuaciones después del cambio\n");
        System.out.print("Jugador 1: ");
        alex.estado();
        System.out.print("Jugador 2: ");
        dani.estado();
        System.out.print("Jugador 3: ");
        cris.estado();

   Movil samsung = new Movil("Samsung","Galaxy A15");
   Movil xiaomi = new Movil("Xiaomi","Redmi Note 13", 128);
   Movil apple = new Movil("Apple","iPhone 15", 256, true);
        System.out.print("Móvil 1: ");
        samsung.estado();
        System.out.print("Móvil 2: ");
        xiaomi.estado();
        System.out.print("Móvil 3: ");
        apple.estado();


    }
}
