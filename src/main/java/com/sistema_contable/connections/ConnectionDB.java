package com.sistema_contable.connections;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDB {

    public static Connection conectar() {
        Properties propiedades = new Properties();
        try (InputStream entrada = ConnectionDB.class.getClassLoader().getResourceAsStream("config.properties")) {
            propiedades.load(entrada);
            String url = propiedades.getProperty("db.url");
            String usuario = propiedades.getProperty("db.user");
            String clave = propiedades.getProperty("db.password");
            Connection conexion = DriverManager.getConnection(
                    url,
                    usuario,
                    clave
            );
            System.out.println("Conectado correctamente");
            return conexion;
        } catch (SQLException e) {
            System.out.println("Error al conectar:");
            System.out.println(e.getMessage());
            return null;
        } catch (Exception e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
            return null;
        }
    }
}