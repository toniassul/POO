package com.example;

import java.util.ArrayList;

public class ListaMedicos {

    ArrayList<Medicos> medicosList;

    public ListaMedicos() {
        medicosList = new ArrayList<>();
    }
    
    public void agregarMedico(Medicos medico) {
        medicosList.add(medico);
    }
    public void mostrarMedicos() {
        for (Medicos medico : medicosList) {
            medico.mostrarInformacion();
            System.out.println("--------------------");
        }
    }
    public Medicos buscarMedicoPorCodigo(int codigo) {
        for (Medicos medico : medicosList) {
            if (medico.getCodigo() == codigo) {
                return medico;
            }
        }
        return null; // Retorna null si no se encuentra el médico
    }
    public void eliminarMedico(int codigo) {
        Medicos medico = buscarMedicoPorCodigo(codigo);
        if (medico != null) {
            medicosList.remove(medico);
            System.out.println("Médico con código " + codigo + " eliminado.");
        } else {
            System.out.println("Médico con código " + codigo + " no encontrado.");
        }
    }
    public void actualizarMedico(int codigo, String nuevoNombre, String nuevaEspecialidad) {
        Medicos medico = buscarMedicoPorCodigo(codigo);
        if (medico != null) {
            medico.setNombre(nuevoNombre);
            medico.setEspecialidad(nuevaEspecialidad);
            System.out.println("Médico con código " + codigo + " actualizado.");
        } else {
            System.out.println("Médico con código " + codigo + " no encontrado.");
        }
    }
}


