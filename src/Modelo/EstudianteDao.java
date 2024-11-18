/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jhoja
 */

import servicios.Conexion;
import java.sql.*;

public class EstudianteDao {
    private Connection connection;

    public EstudianteDao() throws SQLException {
        this.connection = Conexion.getConnection();
    }

    public void registrarEstudiante(Estudiante estudiante) throws SQLException {
        String query = "INSERT INTO estudiante (codigo, nombre, email, colonia_id, carrera_id) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, estudiante.getCodigo());
        statement.setString(2, estudiante.getNombre());
        statement.setString(3, estudiante.getEmail());
        statement.setInt(4, estudiante.getColoniaId());
        statement.setInt(5, estudiante.getCarreraId());
        statement.executeUpdate();
    }
}


