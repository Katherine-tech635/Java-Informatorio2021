package JavaInformatorio2021;
import java.util.Scanner;

public class Level1dos {
    public static void main(String[] args) {
       System.out.println("Ingrese dos numeros: ");
       Scanner scan = new Scanner(System.in);
       int nro1 = scan.nextInt();//escanea el nro ingresado 
       int nro2 = scan.nextInt();
       scan.close();

       int sumar ;
       int restar;
       int multiplicar;
       int dividir;
       int modul;

       sumar= nro1 + nro2;
       restar= nro1-nro2;
       multiplicar= nro1*nro2;
       dividir=nro1/nro2;
       modul=nro1 % nro2;
       System.out.println(nro1 + " + " + nro2 + "= " + sumar );
       System.out.println(nro1 +" - "+ nro2 + "= " + restar );
       System.out.println(nro1 +" * "+ nro2 + "= " + multiplicar );
       System.out.println(nro1 +" / "+ nro2 + "= " + dividir );
       System.out.println(nro1 +" % "+ nro2 + "= " + modul );
    }
}
