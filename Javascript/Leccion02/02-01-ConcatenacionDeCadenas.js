var nombre = "Juan";
var apellido = "Valladares";
var nombreCompleto  = nombre+" "+apellido; // Primera concatenación
console.log(nombreCompleto)
var nombreCompleto2 = "Juan"+" "+"Valladares"; // Segunda concatenación
console.log(nombreCompleto2)
var juntos = nombre + 219; //Lee de izquiera a derecha siguiendo la cadean lee el numero como str
console.log(juntos);
juntos = nombre + (78 + 17);
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += apellido; //Tercera Concatenación usando el operador simplificado
console.log(nombre);