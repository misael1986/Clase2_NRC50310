/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase2_nrc50310;

/**
 *
 * @author misael.perilla
 */
public class Camion extends Vehiculo implements InterfazSimple{
    
    float cargaMaxima;
    String duenho;

    @Override
    public String Traspaso(String duenho, String nuevoDuenho) {
       String cambio;
        System.out.println("Cambiando dueño del vehiculo de "+duenho+" al nuevo dueño "+nuevoDuenho);
       cambio=nuevoDuenho;
       return cambio;
    }
    
}
