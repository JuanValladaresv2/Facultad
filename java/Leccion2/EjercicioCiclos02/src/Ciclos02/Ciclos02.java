package ciclos02;

import javax.swing.*;

public class Ciclos02 {
    public static void main(String[] args) {
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero o presione 0 para salir: "));
        while(numero != 0){
            if (numero > 0){
                JOptionPane.showMessageDialog(null,"El numero: "+numero+" es POSITIVO ");
            }else {
                JOptionPane.showMessageDialog(null,"El numero: "+numero+" es NEGATIVO ");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Vuelva a ingresar otro numero o presione 0 para salir: "));
        }
        JOptionPane.showMessageDialog(null,"FIN");
    }
}