package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        var conteo = 0; //injerencia de tipos
        while(conteo<7){
            System.out.println("conteo = " + conteo);
            conteo++;
        }
        var contador = 0;
        do{
            System.out.println("contando = " + contador);
            contador++;
        }while(contador<=7);

        for(var contador1 =0;contador1<=7;contador1++){
            if(contador1 % 2 == 0) {
                System.out.println("contador1 = " + contador1);
                break;
            }
        }
        for(var contador1 =0;contador1<=7;contador1++){
            if(contador1 % 2 == 0) {
                continue;
            }
            System.out.println("contador1 = " + contador1);
        }
    }
}