package JavaInformatorio2021;
import java.util.Scanner;

public class Level1tres {
  public static void main(String[] args) {
      System.out.println("Ingrese un numero para rango:");
      Scanner scan= new Scanner(System.in);
      int nro= scan.nextInt();
      scan.close();
      System.out.println("Secuencia de numeros hasta " + nro);
        for (int num=1;num<=nro;num++)
        {
            for (int num1=1;num1<=num;num1++){
              System.out.print(num1 + " ");
            }
            System.out.println();
        }
    
}
}
