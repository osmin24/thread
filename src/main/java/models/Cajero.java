/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP 255-G9
 */
public class Cajero {
    
    private double totalPagar;
    private int numeroCajero;
    private double recibido;
    private double devuelto;
    private String nombrePersonaCajero;
    private List<Producto> productos = new ArrayList<>();
    

    public Cajero() {
      
    }

    public Cajero(double totalPagar, int numeroCajero, double recibido, double devuelto, String nombrePersonaCajero) {
  
        this.totalPagar = totalPagar;
        this.numeroCajero = numeroCajero;
        this.recibido = recibido;
        this.devuelto = devuelto;
        this.nombrePersonaCajero = nombrePersonaCajero;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public int getNumeroCajero() {
        return numeroCajero;
    }

    public void setNumeroCajero(int numeroCajero) {
        this.numeroCajero = numeroCajero;
    }

    public double getRecibido() {
        return recibido;
    }

    public void setRecibido(double recibido) {
        this.recibido = recibido;
    }

    public double getDevuelto() {
        return devuelto;
    }

    public void setDevuelto(double devuelto) {
        this.devuelto = devuelto;
    }

    public String getNombrePersonaCajero() {
        return nombrePersonaCajero;
    }

    public void setNombrePersonaCajero(String nombrePersonaCajero) {
        this.nombrePersonaCajero = nombrePersonaCajero;
    }
    
    public void setProductos(Producto producto){
        this.productos.add(producto);
    }
    
    public List<Producto> getProductos(){
        return this.productos;
    }
    
}
