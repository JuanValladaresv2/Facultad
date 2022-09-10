package ciclos02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero o presione 0 para salir: ");
        var numero = Integer.parseInt(scanner.nextLine());
        while(numero != 0){
            if (numero > 0){
                System.out.println("El numero: "+numero+" es POSITIVO ");
            }else {
                System.out.println("El numero: "+numero+" es NEGATIVO ");
            }
            System.out.println("Vuelva a ingresar otro numero o presione 0 para salir: ");
            numero= Integer.parseInt(scanner.nextLine());
        }
        System.out.println("El número "+numero+" finaliza el programa");
    }
}