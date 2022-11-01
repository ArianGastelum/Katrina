/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.katrina.enumeradores;

import com.google.gson.annotations.SerializedName;

/**
 * Evalúa el tipo de movimiento realizado.
 * 
 */
public enum Tipo {
    @SerializedName("1")
    Depósito,
    
    @SerializedName("2")
    Retiro
    
}
