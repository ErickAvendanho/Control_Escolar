/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.controlescolar.academia;

import java.util.ArrayList;

/**
 *
 * @author Erick
 */
public class Secuencia {
    private ArrayList<Materia> materias;
    
    public Secuencia(){
        materias = new ArrayList<>();
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    
    public String agregarMateria(Materia materia){
        //TO DO
        return materia.getNombre();
    }
}
