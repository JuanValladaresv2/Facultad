// Tipos de Datos en Javascript
/*
La sintaxis en lo que es comentarios
es muy similar a la de Java
realmente diriamos que es identica
*/
//Tipo String
var nombre = "Juan"; //Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre)
//Tipo Numerico
var numero = 3000; //Tipo Numerico
console.log(numero);

//Tipo Object
var objeto = {
    nombre : "Juan",
    apellido : "Valladares",
    telefono : "2255414868", 
}

console.log(typeof objeto);

//Tipo de dato boolean
var bandera = true;
console.log(bandera);

//Tipo de dato funcion
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de dato symbol
var simbolo = Symbol("Mi Simbolo");
console.log(typeof simbolo)

//Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof Persona);

//Tipo de dato Undefined
var x;
console.log(x);

x = undefined;
console.log(x);

// null: significa ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es object
console.log(typeof y);

// Tipo de dato array y Empty String
var autos = ["Citroen", "Audi", "BMW", "Ford"]
console.log(autos);
console.log(typeof autos); // Preguntamos que tipo es

var z = "";
console.log(z); // Esto se refiere que es una cadena vacia
console.log(typeof z);