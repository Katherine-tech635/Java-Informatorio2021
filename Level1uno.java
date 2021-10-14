package JavaInformatorio2021;
import java.util.Scanner;

public class Level1uno {
    public static void main(String[] args) {
       System.out.println("Cual es tu nombre?: ");
       Scanner scan = new Scanner(System.in);
       String nombre = scan.nextLine();//escanea el string ingresado 
       scan.close();

       System.out.println("HOLA " + nombre);//lo imprime por pantalla
    }   
    
}
