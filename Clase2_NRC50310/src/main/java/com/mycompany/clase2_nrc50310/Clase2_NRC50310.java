/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase2_nrc50310;

/**
 *
 * @author misael.perilla
 */
public class Clase2_NRC50310 {

    public static void main(String[] args) {
        
        Camion camion= new Camion();
        camion.cargaMaxima=2000;
        camion.encender();
        
        Vehiculo carro = new Vehiculo();
        System.out.println(carro.estadoEncendido);
        carro.apagar();
   
    }
}
