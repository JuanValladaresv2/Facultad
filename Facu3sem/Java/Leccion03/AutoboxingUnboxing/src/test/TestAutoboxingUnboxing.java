package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
            Clases envolventes de tipos primitivos
            int  = la clase envolvente es Integer
            long = la clase envolvente es Long
            float = la clase envolvente es Float
            double = la clase envolvente es Double
            boolean = la clase envolvente es Boolean
            byte = la clase envolvente es Byte
            char = la clase envolvente es Character
            short = la clase envolvente es Short
        */
        
        int enteroPrim = 10; //Tipo primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10; // Tipo object con la clase Integer
        System.out.println("entero = " + entero.doubleValue()); //Autoboxing : Donde una literal primitiva de tipo entera (variable de nombre: "entero" en el ejemplo)  
                                                                //se convierte a otro tipo (SOLO A TRAVÉS DE LAS CLASES WRAPPER( EJEMPLO INTEGER)), en el ejemplo se pasa a double
        
        int entero2 = entero; //Unboxing : inverso al caso anterior, se toma la variable tipo object "entero" y se la transforma a tipo primitivo INT
        System.out.println("entero2 = " + entero2);
    }
}
