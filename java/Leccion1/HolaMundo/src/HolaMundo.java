
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

//Clase 1

        //System.out.println("Hola Mundo desde Java");
        
//Clase 2  

        /*int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";   
        System.out.println(miVariableCadena);
        miVariableCadena ="Sigamos creciendo en programación";
        System.out.println(miVariableCadena);*/
        
//Clase 3

        //Var - Inferencia de tipos en Java
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //Para ejecutar Shitf + F6
        
        //Reglas para definir una variable en Java
        var usuario = "Osvaldo";
        var titular = "Ingeniero";
        var union = titular + " " + usuario; //+ " " + genera un espacio entre palabras
        System.out.println("union = " + union);
        
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b)); //Lee de izquierda a derecha, usuario es tipo STRING asì que en vez de sumar los numeros los concatena
        //Al usar parentesis en A + B cambia la prioridad, y suma primero los numeros
        //Ejercicio Caracteres especiales en Java
        var nombre = "Natalia";
        System.out.println("Nueva linea: \n" + nombre); // \n para hacer un salto de linea
        System.out.println("Tabulador: \t" + nombre); // \t para hacer un   espacio en la consola
        System.out.println("\t .:MENU:.");
        System.out.println("Retroceso: \b" + nombre); // \b borra un dìgito comenzando desde el final
        System.out.println("Comillas simples: \' " +nombre+"\'"); // \' pone comillas simples en la concatenacion
        System.out.println("Comillas dobles: \""+nombre+"\" ");  // Odio Java
        
        //Clase Scanner
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el título");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);
        
        //Ejercicio libro
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el titulo");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor");
        String autor = scanner.nextLine();
        System.out.println(titulo + "fue escrito por:" + autor);*/
        
//Clase 4

        //Tipos numericos enteros
       
        /* byte numEnteroByte = 127;
         System.out.println("numEnteroByte = " + numEnteroByte);
         System.out.println("Valor minimo del Byte:"+ Byte.MIN_VALUE);
         System.out.println("Valor maximo del Byte:"+ Byte.MAX_VALUE);
         
         short numEnteroShort = 32767;
         System.out.println("numEnteroShort = " + numEnteroShort);
         System.out.println("Valor minimo del Short:"+ Short.MIN_VALUE);
         System.out.println("Valor maximo del Short:"+ Short.MAX_VALUE);
         
         int numEnteroInt = 2147483647;
         System.out.println("numEnteroShort = " + numEnteroInt);
         System.out.println("Valor minimo del Int:"+ Integer.MIN_VALUE);
         System.out.println("Valor maximo del Int:"+ Integer.MAX_VALUE);
         
         long numEnteroLong = 9223372036854775807L;
         System.out.println("numEnteroShort = " + numEnteroLong);
         System.out.println("Valor minimo del Long:"+ Long.MIN_VALUE);
         System.out.println("Valor maximo del Long:"+ Long.MAX_VALUE);
         
        //Tipos flotantes
         
         float numFloat = 3.4028235E38F;
         System.out.println("numFloat = " + numFloat);
         System.out.println("El valor minimo de float:"+ Float.MIN_VALUE);
         System.out.println("El valor maximo de float:"+ Float.MAX_VALUE);
         
         double numDouble = 1.7976931348623157E308D;
         System.out.println("numDouble = " + numDouble);
         System.out.println("El valor minimo de double:"+ Double.MIN_VALUE);
         System.out.println("El valor maximo de double:"+ Double.MAX_VALUE); */
        
//Clase 5
        
        //Inferencia de tipos var y tipos primitivos
        
        /* var numEntero = 20; // Las literales sin punto automaticamente son de tipo int
         System.out.println("numEntero =" + numEntero);
        
         var numFloat = 10.0F; //Automaticamente con el punto se convierte en tipo double
         System.out.println("numFloat = " + numFloat);
         var numDouble = 10.0;
         System.out.println("numDouble = " + numDouble);
        
        //Tipos primitivos char
        
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36 ; //Valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo= '$'; //un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        var varCaracter1 = '\u0024'; //Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        var varCaracterDecimal1 = (char)36 ; //Valor entero y le asigna un tipo INT
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        var varCaracterSimbolo1= '$'; //un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);*/
        
        //CLASE 6
        
        //Tipos primitivos tipos booleanos
        
        /*var varBool = false;
        System.out.println("varBool = " + varBool);
        
        if (varBool){
            System.out.println("La vandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
        
        //Algoritmo: ¿Es mayor de edad?
        
        var edad = 18;//Literal tener presente la inferencia de tipos
        var adulto = edad >=18;//Esta es una expresión booleana
        if(edad >=18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
        
        //Conversión de tipos primitivos
        
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir un valor
        
        var entrada = new Scanner(System.in);
        System.out.println("Digote si edad: ");
        edad = Integer.parseInt (entrada.nextLine());
        System.out.println("edad= " + edad);

        //Conversión de tipos primitivos en Java Parte 2
        
         var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(0);
        System.out.println("fraseChar = " + fraseChar);
        
         System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);*/
    }
}
