/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import java.util.List;

/**
 *
 * contiene los datos de una cuenta bancaria
 */

public class Cuenta {
    
    
   private Cliente cliente;
   private String cuenta;
   private String clabe;
   private String moneda;
   private List<Movimientos> movimientos;
   public Cuenta deserealizar(String json){
   
       Cuenta c = new Cuenta();   
   try{
        c = new Gson().fromJson(json, Cuenta.class);
       
       
   }catch(Exception ex){
     
       System.out.print("Ocurrió un error");
   }
   return c;
   }
  

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public List<Movimientos> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimientos> movimientos) {
        this.movimientos = movimientos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
   
   
   
}
