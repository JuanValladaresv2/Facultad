package Ejercicio_6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double montoGuillermo=0;
        double montoLuis =0;
        double montoJuan =0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el monto en USD que posee Guillermo");
        montoGuillermo = Double.parseDouble(entrada.nextLine());
        montoLuis = (montoGuillermo>0?(montoGuillermo / 2):0);
        montoJuan = (montoGuillermo+montoLuis>0?((montoLuis+montoGuillermo)/2):0);
        System.out.println("USD de Guillermo: $"+montoGuillermo);
        System.out.println("USD de Luis: $"+montoLuis);
        System.out.println("USD de Juan: $"+montoJuan);
    }
}