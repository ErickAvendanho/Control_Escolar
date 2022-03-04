/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.controlescolar;

import java.util.ArrayList;
import java.util.Date;
import mx.com.upiicsa.controlescolar.controlescolar.SituacionAcademica;
import mx.com.upiicsa.controlescolar.entidades.Persona;

/**
 *
 * @author Erick
 */
public class Alumno extends Persona{
    private String boleta;
    private ArrayList<SituacionAcademica> situacion;
    
    public Alumno(){
        situacion = new ArrayList<>();//Instancia de ArrayList
    }

    public String getBoleta() {
        return boleta;
    }

    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }

    public ArrayList<SituacionAcademica> getSituacion() {
        return situacion;
    }

    public void setSituacion(ArrayList<SituacionAcademica> situacion) {
        this.situacion = situacion;
    }
}
