/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase2_nrc50310;

/**
 *
 * @author misael.perilla
 */
public class Vehiculo {
    
    String marca;
    String placa;
    protected int cilindraje;
    boolean estadoEncendido;
    private String nombre;
    
    public Vehiculo(){
    this.estadoEncendido=false;
    }
            
    
    
    public void encender(){
    if (this.estadoEncendido==true){
        System.err.println("Vehiculo ya se encuentra encendido");
    }
    else {
        this.estadoEncendido=true;
        System.out.println("Vehiculo encendido");
    }
    }
    
    
    public void apagar(){
        if (this.estadoEncendido){
            System.err.println("Vehiculo está siendo apagado");
            this.estadoEncendido=false;
            
        }
        else {
            System.out.println("Vehiculo ya está apagado");
        }
    }
    
    
    
}
