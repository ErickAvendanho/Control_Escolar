/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.controlescolar.controlescolar;

import java.util.ArrayList;
import mx.com.upiicsa.controlescolar.academia.Materia;

/**
 *
 * @author Erick
 */
public class SituacionAcademica {
    private String nombreCarrera;
    private ArrayList<Materia> materiasAcreditadas;
    private Boolean status;
    private String semestre;
    private String carrera;
    private float creditos;
    
    public SituacionAcademica(){
        materiasAcreditadas = new ArrayList<>();//Instancia de ArrayList
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public ArrayList<Materia> getMateriasAcreditadas() {
        return materiasAcreditadas;
    }

    public void setMateriasAcreditadas(ArrayList<Materia> materiasAcreditadas) {
        this.materiasAcreditadas = materiasAcreditadas;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getCreditos() {
        return creditos;
    }

    public void setCreditos(float creditos) {
        this.creditos = creditos;
    }
}
