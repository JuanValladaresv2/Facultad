package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        var entrada =  new Scanner(System.in);
        System.out.println("Ingrese el salario por hora");
        double salario= Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese las horas trabajadas");
        int horas= Integer.parseInt(entrada.nextLine());
        double salarioAPagar= salario*horas;
        System.out.println("Trabajo: "+horas+" horas");
        System.out.println("Se paga por Hora: $"+salario);
        System.out.println("Se debera pagar: $"+salarioAPagar);
    }
}