
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        Producto producto3 = new Producto("Remera", 2500.00);
        Producto producto4 = new Producto("Medias", 1500.00);
        Producto producto5 = new Producto("Camisa", 10500.00);
        Producto producto6 = new Producto("Boxer", 1000.00);
        Producto producto7 = new Producto("Anteojos", 12000.00);
        Producto producto8 = new Producto("Short", 2200.00);
        Producto producto9 = new Producto("Gorra", 3200.00);
        Producto producto10 = new Producto("Jean", 13900.00);
       
        Orden orden1 = new Orden();
        //Agregamos productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.mostrarOrden();
        
        //Tarea: 
        //Crear mas objetos de tipo Producto
        //Crear mas objetos de tipo Orden
    }
}
