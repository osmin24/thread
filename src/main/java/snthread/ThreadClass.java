/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snthread;

import java.util.List;
import models.Cajero;
import models.Cliente;
import models.Producto;

/**
 *
 * @author HP 255-G9
 */
public class ThreadClass extends Thread{
    
    @Override
    public void run(){
        
        long initialTime = System.currentTimeMillis();
        Cliente cliente = new Cliente();
        
        cliente.setId("234234");
        cliente.setNombre("Manuel");
        cliente.setPagar(300000.00);
        
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        Producto producto3 = new Producto();
        Producto producto4 = new Producto();
        
        producto1.setNombre("Cama");
        producto1.setPrecio(200.0);
        producto1.setUnidades(1);
        
        producto2.setNombre("Almoada");
        producto2.setPrecio(20.0);
        producto2.setUnidades(4);
       
        producto3.setNombre("Camiseta");
        producto3.setPrecio(100.0);
        producto3.setUnidades(3);
        
        producto4.setNombre("Lapiz");
        producto4.setPrecio(10.0);
        producto4.setUnidades(10);
        
        
        Cajero cajero = new Cajero();
        cajero.setNumeroCajero(1);
        cajero.setNombrePersonaCajero("Oscar");
        cajero.setProductos(producto1);
        cajero.setProductos(producto2);
        cajero.setProductos(producto3);
        cajero.setProductos(producto4);
        
        cobrar(cajero,cliente,initialTime);
        
    }
    
    private void cobrar(Cajero cajero,Cliente cliente, long timeStanp){
        
        Cajero cajero1 = cajero;
        Cliente cliente1 = cliente;
        List<Producto> productos = cajero1.getProductos();
        double total = 0.0;
        
        cajero.setRecibido(cliente1.getPagar());
        System.out.println("Id Cliente: "+cliente1.getId());
        System.out.println("Cliente: "+cliente1.getNombre());
        long initialTimetotal = System.currentTimeMillis();
        
        for(Producto element : productos){
            long initialTime = System.currentTimeMillis();
            System.out.println("================================");
            System.out.println("Nombre: "+element.getNombre());
            System.out.println("Precio: "+element.getPrecio());
            System.out.println("Unidades: "+element.getUnidades());
            System.out.println("==========");
            long finaltime = System.currentTimeMillis();
            System.out.println("Tiempo: "+(finaltime - initialTime));
            double precio = element.getPrecio()*element.getUnidades();
            total = total + precio;
            System.out.println("================================");
        }
        long finaltimetotal = System.currentTimeMillis();
        cajero1.setTotalPagar(total);
        System.out.println("Total a pagar: "+cajero1.getTotalPagar());
        cajero.setDevuelto(total - cajero.getRecibido());
        
        System.out.println("Cajero numero: "+cajero1.getNumeroCajero());
        System.out.println("Nombre de personal: "+cajero1.getNombrePersonaCajero());
        System.out.println("Total recibido: "+cajero1.getRecibido());
        System.out.println("Total devuelto: "+cajero1.getDevuelto());
        System.out.println("Tiempo total: "+(finaltimetotal - initialTimetotal));
        System.out.println("================================");
    }
    
}
