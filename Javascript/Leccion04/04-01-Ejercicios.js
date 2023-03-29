//Ejercicio 1: Calcular estación del año
let mes = 9;
let estacion;
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("El valor corresponde a la estación de: "+estacion);
//Ejercicio 2: Hora del día
/*
de 6 a 11 nos saluda: Good Morning
de 12 a 16 nos saluda: Good afternoom
de 17 a 19 nos saluda: Good evening
de 20 a 23 nos saluda: Good night
Trabajaremos con 24 horas
*/
let horaDia = 9;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Good morning";
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje = "Good afternoom";
}
else if(horaDia >= 17 && horaDia <= 19){
    mensaje = "Good evening";
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje = "Good night";
}
else{
    mensaje = "Valor incorrecto";
}
console.log(mensaje);

//Estructura switch(la sintaxis es igual a Java)
switch(mes){ //No solo se pueden utilizar número, también cadenas
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("Bienvenido a la estación de: "+estacion);

//Ampliando el uso de var let y const
/*
Con var puedes reasignar en cualquier momento
este forma parte del ambito global
Un error es que se sobreescriba  
*/

var nombre = 'Juani';
nombre = 'matias';
console.log(nombre);

function saludar(){
    var nombre3 = 'Tiago';
    console.log(nombre3);
}
//console.log(nombre3); //Aquí no lee el dato en la función


if(true){
    var edad = 22;
    console.log(edad);
}
console.log(edad); //En la función funciono correctamente, en la estructura if fallo

/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves 
o dentro de una función
*/

function saludar2(){
    let nombre2 = 'Juani';
    console.log(nombre2);
}
//console.log(nombre2);

if(true){
    let edad2 = 20;
    console.log(edad2);
}
//console.log(edad2);

/*
const se utiliza para valores constantes que no pueden ser reasignadas
*/

const fechaNacimiento = 2001;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento); //solo se ejecuta el console anterior

-
//Evitar repetir tu codigo
//Dry don't repeat yourself

let days = 5;
switch (days) {
    case 1:
        console.log("Hoy es Lunes");
        break;
    case 2:
        console.log("Hoy es Martes");
        break;
    case 3:
        console.log("Hoy es Miercoles");
        break;
    case 4:
        console.log("Hoy es Jueves");
        break;
    case 5:
        console.log("Hoy es Viernes");
        break;
    case 6:
        console.log("Hoy es Sabado");
        break;
    case 7:
        console.log("Hoy es Domingo");
        break;
    default:
        console.log("Error en el ingreso del dia de la semana")
        break;
}

//Esta es la funcion mejorada

let days2 = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"]
function getDay(n){
    if(n < 1 || n > 7){
        throw new Error("out of range")
    }
    return days2[n-1];
}
console.log(getDay(3));

//Hacer un ejercicio similar al que esta hecho, pero ahora con los
//meses del año, debes hacerlo con la estructura switch y luego con
//la funcion en la opcion mejorada

let months = 5;
switch (months) {
    case 1:
        console.log("Hoy es Enero");
        break;
    case 2:
        console.log("Hoy es Febrero");
        break;
    case 3:
        console.log("Hoy es Marzo");
        break;
    case 4:
        console.log("Hoy es Abril");
        break;
    case 5:
        console.log("Hoy es Mayo");
        break;
    case 6:
        console.log("Hoy es Junio");
        break;
    case 7:
        console.log("Hoy es Julio");
        break;
    case 8:
        console.log("Hoy es Agosto");
        break;
    case 9:
        console.log("Hoy es Septiembre");
        break;
    case 10:
        console.log("Hoy es Octubre");
        break;
    case 11:
        console.log("Hoy es Noviembre");
        break;
    case 12:
        console.log("Hoy es Diciembre");
        break;
    default:
        console.log("Error en el ingreso del Mes")
        break;
    }

    let months2 = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
function getMonths(n){
    if(n < 1 || n > 12){
        throw new Error("out of range")
    }
    return months2[n-1];
}
console.log(getMonths(10));