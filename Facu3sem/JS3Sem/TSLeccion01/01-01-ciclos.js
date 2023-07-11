// while
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador ++;
}
console.log("Fin del ciclo while");

//do while
let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log("Fin del ciclo do while");

//for
for(let contando = 0; contando < 3; contando++ ){
    console.log(contando);
}
console.log("Fin del ciclo for");

// Palabra reservada break
for(let contando = 0; contando <= 10; contando++){
    if (contando % 2 == 0){
        console.log(contando); //Muestra todos los pares
        break;
    }
}
console.log("Termina el ciclo al encontrar el primer numero par");

let contado  = 0;
while (contado <= 10){
    if (contado % 2 == 0){
        console.log(contado)
    }
    contado++
}

let contadores = 0
do{
    if (contadores % 2 == 0)
        console.log(contadores)
        contadores++
}while(contadores <= 10)