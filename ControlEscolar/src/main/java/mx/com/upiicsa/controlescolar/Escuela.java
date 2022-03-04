/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.controlescolar;

import java.util.ArrayList;
import mx.com.upiicsa.controlescolar.academia.*;
import mx.com.upiicsa.controlescolar.entidades.Direccion;

/**
 *
 * @author Erick
 */
public class Escuela {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Materia> materias;
    private ArrayList<Secuencia> secuencias;
    private ArrayList<Academia> academias;
    private ArrayList<Curso> cursos;
    private ArrayList<Grupo> grupos;
    private Direccion direccion;
    private ArrayList<String> carreras;
    
    public Escuela(){
        profesores = new ArrayList<>();
        alumnos = new ArrayList<>();
        materias = new ArrayList<>();
        secuencias = new ArrayList<>();
        academias = new ArrayList<>();
        cursos = new ArrayList<>();
        grupos = new ArrayList<>();
        carreras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public ArrayList<Secuencia> getSecuencias() {
        return secuencias;
    }

    public void setSecuencias(ArrayList<Secuencia> secuencias) {
        this.secuencias = secuencias;
    }

    public ArrayList<Academia> getAcademias() {
        return academias;
    }

    public void setAcademias(ArrayList<Academia> academias) {
        this.academias = academias;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<String> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<String> carreras) {
        this.carreras = carreras;
    }
    
    
}
