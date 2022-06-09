package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
private static final int SALARIO=1000;
    public static void main(String[] args) {

        int cantCarros=0;
        double porcenVenta=0;
        double precioCarro=0;
        double salarioPagar=0;
        double comision =0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite cantidad de carros vendidos: ");
        cantCarros= Integer.parseInt(entrada.nextLine());
        comision=cantCarros>0?cantCarros*150:0;
        System.out.print("Digite el precio del carro: $");
        precioCarro=Double.parseDouble(entrada.nextLine());
        porcenVenta=(precioCarro>0?((precioCarro*5)/100):0);
        porcenVenta=porcenVenta*(cantCarros>0?cantCarros:0);
        salarioPagar=SALARIO+porcenVenta+comision;
        System.out.println("Sueldo Basico           : $"+SALARIO);
        System.out.println("Bonificacion por ventas : $"+porcenVenta);
        System.out.println("Comision cant. Ventas   : $"+comision);
        System.out.println("El salario a pagar es de: $"+salarioPagar);
    }
}