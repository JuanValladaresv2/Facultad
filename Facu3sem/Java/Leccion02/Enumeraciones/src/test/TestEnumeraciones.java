package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Día 1: "+ Dias.LUNES);
        //indicarDiaSemana(Dias.MARTES); // LAS ENUMERACIONES SE TRATAN COMO CADENAS
        //AHORA NO SE DEBEN UTILIZAR COMILLAS, SE ACCEDE A TRAVÉS DEL OPERADOR DE PUNTO
        System.out.println("Continente No. 4: "+ Continentes.AMERCA);
        System.out.println("No. de países en el 4to. contiente: "+ Continentes.AMERCA.getPaises());
        System.out.println("No. de habitantes en el 4to. contiente: "+ Continentes.AMERCA.getHabitantes());
        System.out.println("Continente No. 1: "+ Continentes.AFRICA);
        System.out.println("No. de países en el 1er. contiente: "+ Continentes.AFRICA.getPaises());
        System.out.println("No. de habitantes en el 1er. contiente: "+ Continentes.AFRICA.getHabitantes());
        System.out.println("Continente No. 2: "+ Continentes.EUROPA);
        System.out.println("No. de países en el 2do. contiente: "+ Continentes.EUROPA.getPaises());
        System.out.println("No. de habitantes en el 2do. contiente: "+ Continentes.EUROPA.getHabitantes());
        System.out.println("Continente No. 3: "+ Continentes.ASIA);
        System.out.println("No. de países en el 3er. contiente: "+ Continentes.ASIA.getPaises());
        System.out.println("No. de habitantes en el 3er. contiente: "+ Continentes.ASIA.getHabitantes());
        System.out.println("Continente No. 5: "+ Continentes.OCEANIA);
        System.out.println("No. de países en el 5to. contiente: "+ Continentes.OCEANIA.getPaises());
        System.out.println("No. de habitantes en el 5to. contiente: "+ Continentes.OCEANIA.getHabitantes());
        
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer día de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo día de la semana");
                break;
            default:
                System.out.println("Error, día no válido");
                break;
        }
    }
    
}
