/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.controlescolar.academia;

import java.util.ArrayList;
import mx.com.upiicsa.controlescolar.*;

/**
 *
 * @author Erick
 */
public class Curso {
    private Materia materia;
    private HoraClase horario;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos;
    
    public Curso(){
        alumnos = new ArrayList<>();//Instancia de ArrayList
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public HoraClase getHorario() {
        return horario;
    }

    public void setHorario(HoraClase horario) {
        this.horario = horario;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
