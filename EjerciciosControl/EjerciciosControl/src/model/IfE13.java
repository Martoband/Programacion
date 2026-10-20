public class IfE13{
// import util.java.Scanner
public static void main (String[] args){

Scanner sc = new Scanner (System.in);
int edad;
int dia;
double precio;
boolean menores;
boolean adolescentes;
boolean adultos;

System.out.println("Introduce tu edad");
edad = sc.nextInt();
System.out.println("Introduce el dia de la semana (en numero):");
System.out.println("1-Lunes");
System.out.println("2-Martes");
System.out.println("3-Miercoles");
System.out.println("4-Jueves");
System.out.println("5-Viernes");
System.out.println("6-Sabado");
System.out.println("7-Domingo");
dia = sc.nextInt();
sc.close();

System.out.println("Edad:" +edad);
Sustem.out.printf("Día de la semana: (%d) - %s ",dia, diaString);
menores = edad<12;
adolescentes = edad>12 && edad<17;
adultos = edad>18 && edad<64
System.out.println("¿Eres menor de 12 años?" +menores);
if(menores){
precio=0}
else if(adolescentes){
	if(dia==2){precio=0;}
	precio=5;}
else if(adultos){
	if(dia==4){precio=7;}
	precio=10;}
else{
precio=6;
}
	}

}
