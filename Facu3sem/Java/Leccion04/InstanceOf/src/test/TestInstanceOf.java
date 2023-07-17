package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Agustin", 10000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Juan", 5000, "Sistemas");
        determinarTipo(empleado1);
    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            //Gerente gerente =(Gerente)empleado;
            ((Gerente) empleado).getDepartamento();
            System.out.println("Gerente ="+ empleado);
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo empleado");
            //Gerente gerente =(Gerente)empleado;
            //System.out.println(gerente.getDepartamento());
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}
