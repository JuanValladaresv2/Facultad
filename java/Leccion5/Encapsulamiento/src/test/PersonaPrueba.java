
package test;

import dominio.Persona; //Si hay más de una clase en el paquete a exportar se usa * después del punto

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 57000.00, false);
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        // Modificar a través de los métodos
        persona1.setNombre("Juan Ignacio");
        // persona1.nombre = "Juan Ignacio"; ya no se puede utilizar
        // System.out.println("Nombre es: "+persona1.nombre); error
        System.out.println("persona1 con su nombre modificado es: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());
        
        // Tarea: Crear otro objeto tipo Persona, asignar valores de manera inicial
        // e imprimir, luego modificar sus valores y volver a imprimir
        
        Persona persona2 = new Persona("Agustin", 60000.00, false);
        System.out.println("persona2 nombre inicial: "+persona2.getNombre());
        System.out.println("persona2 resultado de sueldo: "+persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano: "+persona2.isEliminado());
        persona2.setNombre("Franco");
        persona2.setSueldo(52000.00);
        persona2.setEliminado(true);
        System.out.println("persona2 nombre inicial: "+persona2.getNombre());
        System.out.println("persona2 resultado de sueldo: "+persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano: "+persona2.isEliminado());
        
        System.out.println("persona1 = " + persona1);
    }
    

}
