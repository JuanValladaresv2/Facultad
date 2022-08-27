
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
        System.out.println(miVariableCadena);
        
//Clase 3

        //Var - Inferencia de tipos en Java
        var miVariableEntera2 = 10;
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
        System.out.println("Comillas dobles: \""+nombre+"\" "); */
        
        //Clase Scanner
        
        /*Scanner entrada = new Scanner(System.in);
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
        
        /*var numEntero = 20; // Las literales sin punto automaticamente son de tipo int
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
        System.out.println("caracterChar = " + caracterChar);
        
//CLASE 6
        
        //Tipos primitivos tipos booleanos
        
        var varBool = false;
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
        }*/
        
        //Conversión de tipos primitivos
        
        /*var edad = Integer.parseInt("20");
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
        
//Clase 7

        /*int num1 = 5, num2 = 4;
        //inferencia de tipos no se puede asignar varias variables en la misma linea
        var solucion = num1 + num2;
        System.out.println("Solucion de la suma= "+solucion);

        solucion = num1 - num2;
        System.out.println("solucion de la resta= "+solucion);

        solucion= num1*num2;
        System.out.println("Solucion de la multiplicacion= "+solucion);

        solucion = num1/num2;
        System.out.println("Solucion de la division="+solucion);

        var solucion2 = 3.4/num2;
        System.out.println("Solucion2 de la division="+solucion2);

        solucion = num1 % num2;
        System.out.println("solucion resultado del mod = "+solucion);

        if (num1 % 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        

        int varNum1=4, varNum2=4;
        int varNum3=varNum1+6 - varNum2;
        System.out.println("varNum3= "+varNum3);

        varNum1+=1;//Operador de Composicion
        System.out.println("varNum1 suma = "+varNum1);

        //-=  *=  /=  %=
        varNum1-=1;//Operador de Composicion resta
        System.out.println("varNum1 resta= "+varNum1);
        varNum1*=1;//Operador de Composicion producto
        System.out.println("varNum1 producto = "+varNum1);
        varNum1/=1;//Operador de Composicion division
        System.out.println("varNum1 division = "+varNum1);
        varNum1%=1;//Operador de Composicion modulo
        System.out.println("varNum1 modulo = "+varNum1);*/
        
        //Clase 8
        //Operadores Unrios: Cambio de Signo
        
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);//El resultado será un número negativo
        
        //Operador de Negación
        var varC = true; //Esta literal por default en java es de tipo boolean
        var varD = !varC; //Aqui esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //Operadores Unarios de Incremeto: Preincremento
        var varE = 9; //Se va a modificar su valor
        var varF = ++varE; //Simbolo antes de la variables
        //Primero se incrementa la variable y después se usa su valor
        System.out.println("varE = " + varE); //Se incremente en la unidad
        System.out.println("varF = " + varF); //Va a sumar uno
        
        //Postincremento (el simbolo va después de la variable)
        var varG = 3;
        var varH = varG++; //Primero el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores Unarios de decremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI); //La variables ya estacon decremento
        System.out.println("varJ = " + varJ);
        
        //Postdecremento
        var varK = 8;
        var VarL =varK --;//Primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK); //Aqui va a decrementar en 1
        System.out.println("VarL = " + VarL);
        
        //Operadores de igualadad y Relacionales
        var aNum =5;
        var bNum= 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum != bNum;
        
        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
        var gVar = aNum != bNum;
        System.out.println("gVar = " + gVar);
        
        if(aNum % 2 == 0) {
            System.out.println("El numero es Par");
        } else {
            System.out.println("El numero es Impar");
        }

        var edad = 30;
        var adulto = 18;
        if(edad >= adulto) {
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
        
        var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        
        if(respuesta){
            System.out.println("Esta dentro del rango establecido");
        } else{
            System.out.println("Esta fuera de rango establecido");
        }
        
        var vacaciones = true;
        var diaLibre = true;
        if (vacaciones || diaLibre)
            System.out.println("Papá puede asistir al juego de su hijo");
        else
            System.out.println("Papá no puede asistir al juego de su hijo");
        
        //Operador Ternario
        var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "Es Par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z);//16
        
        var solucionAritmetica = 4 + 5 * 6 / 3; //4 + ((5 * 6) / 3) = 30 / 3 = 10 + 4 = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4 + 5) * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    }
}