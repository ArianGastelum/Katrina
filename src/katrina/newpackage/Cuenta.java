/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package katrina.newpackage;

import com.google.gson.Gson;
import java.util.List;

/**
 *
 * @author stafa
 */

public class Cuenta {
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
   private Cliente cliente;
   private int cuenta;
   private int clabe;
   private String moneda;
   private List<Movimientos> movimientos;
   public Cuenta deserealizar(String json){
    Cuenta c = new Cuenta();   
   try{
        c = new Gson().fromJson(json, Cuenta.class);
       
       
   }catch(Exception ex){
     
       System.out.print("Ocurrio un error: " + ex.getMessage());
   }
   return c;
   }
  

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getClabe() {
        return clabe;
    }

    public void setClabe(int clabe) {
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

    
   
   
   
   
}
