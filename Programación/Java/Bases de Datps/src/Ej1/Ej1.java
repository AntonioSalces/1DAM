package Ej1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ej1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/curso2425";
        String usuario = "asalalc";
        String clave = "1234";

        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
            String sql = "SELECT * FROM empresas";
            sentencia = conexion.createStatement();

            resultado = sentencia.executeQuery(sql);

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String co = resultado.getString("co");
                int numeroEmpleados = resultado.getInt("numeroEmpleados");

                System.out.println("ID: " + id + ", nombre: " + nombre + ", C.O.: " + co + ", numero de empleados: " + numeroEmpleados);
            }
        } catch (SQLException e) {
            // TODO: handle exception
        } finally {
            try {
                if (conexion != null) conexion.close();
                if (sentencia != null) sentencia.close();
                if (resultado != null) resultado.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
