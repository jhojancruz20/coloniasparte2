/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author jhoja
 */
import Modelo.Estudiante;
import Modelo.EstudianteDao;
import Vista.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Controlador {
    private EstudianteDao estudianteDAO;
    private vista vistaEstudiante;

    public Controlador(EstudianteDao estudianteDAO, vista vistaEstudiante) {
        this.estudianteDAO = estudianteDAO;
        this.vistaEstudiante = vistaEstudiante;
        this.vistaEstudiante.addGuardarListener(new GuardarEstudianteListener());
    }

    class GuardarEstudianteListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                Estudiante estudiante = new Estudiante(
                    vistaEstudiante.getCodigo(),
                    vistaEstudiante.getNombre(),
                    vistaEstudiante.getEmail(),
                );
                estudianteDAO.registrarEstudiante(estudiante);
                vistaEstudiante.mostrarMensaje("Estudiante registrado con éxito");
            } catch (SQLException ex) {
                vistaEstudiante.mostrarMensaje("Error: " + ex.getMessage());
            }
        }
    }
}

