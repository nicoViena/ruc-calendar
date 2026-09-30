package com.sistema_contable.Implements;

import com.sistema_contable.interfaces.IVencimientosDao;
import com.sistema_contable.model.Vencimientos;
import com.sistema_contable.connections.ConnectionDB;
import com.sistema_contable.model.Cliente;
import com.sistema_contable.model.PLE;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VencimientosDaoImpl implements IVencimientosDao {

    private Connection cn;

    @Override
    public List<Vencimientos> buscarPorPeriodo(String mesColumna, int año) {
        List<Vencimientos> lista = new ArrayList<>();
        Vencimientos v = null;
        Cliente c;
        PLE ple;
        PreparedStatement st;
        ResultSet rs;
        String query = null;
        try {
            query = "SELECT c.nombre, c.ruc, v.ult_dig_ruc, "
                    + "v." + mesColumna + " AS vencimiento_sunat, "
                    + "p." + mesColumna + " AS vencimiento_ple "
                    + "FROM cliente c "
                    + "JOIN vencimientos v "
                    + "ON RIGHT(c.ruc, 1)::INTEGER = v.ult_dig_ruc "
                    + "JOIN ple p "
                    + "ON RIGHT(c.ruc, 1)::INTEGER = p.ult_dig_ruc "
                    + "WHERE v.anio = ? AND p.anio = ? "
                    + "ORDER BY v.ult_dig_ruc ASC";
            cn = ConnectionDB.conectar();
            st = cn.prepareStatement(query);
            st.setInt(1, año);
            st.setInt(2, año);
            rs = st.executeQuery();
            while (rs.next()) {
                c = new Cliente();
                c.setNombre(rs.getString("nombre"));
                c.setRUC(rs.getString("ruc"));
                v = new Vencimientos();
                v.setUltimo_digito(rs.getInt("ult_dig_ruc"));
                v.setVencimiento(rs.getString("vencimiento_sunat"));
                ple = new PLE();
                ple.setVencimiento_ple(rs.getString("vencimiento_ple"));
                v.setCliente(c);
                v.setPle(ple);
                lista.add(v);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar vencimientos por periodo: " + e.getMessage()
            );
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public Vencimientos buscarPorRUC(String ruc, int año, String tipo) {
        Vencimientos v = null;
        PreparedStatement st;
        ResultSet rs;
        String query = null;
        int ultimoDigito = ruc.charAt(ruc.length() - 1) - '0';
        try {
            if (tipo.equalsIgnoreCase("IMPUESTOS")) {
                query = "SELECT * FROM vencimientos "
                        + "WHERE ult_dig_ruc = ? AND anio = ?";
            } else if (tipo.equalsIgnoreCase("PLE")) {
                query = "SELECT * FROM ple "
                        + "WHERE ult_dig_ruc = ? AND anio = ?";
            } else if (tipo.equalsIgnoreCase("AMBOS")) {
                query = "SELECT v.*, "
                        + "p.enero AS ple_enero, "
                        + "p.febrero AS ple_febrero, "
                        + "p.marzo AS ple_marzo, "
                        + "p.abril AS ple_abril, "
                        + "p.mayo AS ple_mayo, "
                        + "p.junio AS ple_junio, "
                        + "p.julio AS ple_julio, "
                        + "p.agosto AS ple_agosto, "
                        + "p.septiembre AS ple_septiembre, "
                        + "p.octubre AS ple_octubre, "
                        + "p.noviembre AS ple_noviembre, "
                        + "p.diciembre AS ple_diciembre "
                        + "FROM vencimientos v "
                        + "JOIN ple p ON v.ult_dig_ruc = p.ult_dig_ruc "
                        + "AND v.anio = p.anio "
                        + "WHERE v.ult_dig_ruc = ? AND v.anio = ?";
            } else {
                System.out.println("Tipo de vencimiento no valido");
                return null;
            }
            cn = ConnectionDB.conectar();
            st = cn.prepareStatement(query);
            st.setInt(1, ultimoDigito);
            st.setInt(2, año);
            rs = st.executeQuery();
            while (rs.next()) {
                v = new Vencimientos();
                v.setUltimo_digito(rs.getInt("ult_dig_ruc"));
                v.setAño(rs.getInt("anio"));
                // SOLO VENCIMIENTO O AMBOS
                if (tipo.equalsIgnoreCase("IMPUESTOS")|| tipo.equalsIgnoreCase("AMBOS")) {
                    v.setEnero(rs.getString("enero"));
                    v.setFebrero(rs.getString("febrero"));
                    v.setMarzo(rs.getString("marzo"));
                    v.setAbril(rs.getString("abril"));
                    v.setMayo(rs.getString("mayo"));
                    v.setJunio(rs.getString("junio"));
                    v.setJulio(rs.getString("julio"));
                    v.setAgosto(rs.getString("agosto"));
                    v.setSeptiembre(rs.getString("septiembre"));
                    v.setOctubre(rs.getString("octubre"));
                    v.setNoviembre(rs.getString("noviembre"));
                    v.setDiciembre(rs.getString("diciembre"));
                }
                // SOLO PLE
                if (tipo.equalsIgnoreCase("PLE")) {
                    PLE ple = new PLE();
                    ple.setEnero(rs.getString("enero"));
                    ple.setFebrero(rs.getString("febrero"));
                    ple.setMarzo(rs.getString("marzo"));
                    ple.setAbril(rs.getString("abril"));
                    ple.setMayo(rs.getString("mayo"));
                    ple.setJunio(rs.getString("junio"));
                    ple.setJulio(rs.getString("julio"));
                    ple.setAgosto(rs.getString("agosto"));
                    ple.setSeptiembre(rs.getString("septiembre"));
                    ple.setOctubre(rs.getString("octubre"));
                    ple.setNoviembre(rs.getString("noviembre"));
                    ple.setDiciembre(rs.getString("diciembre"));
                    v.setPle(ple);
                }
                // AMBOS
                if (tipo.equalsIgnoreCase("AMBOS")) {
                    PLE ple = new PLE();
                    ple.setEnero(rs.getString("ple_enero"));
                    ple.setFebrero(rs.getString("ple_febrero"));
                    ple.setMarzo(rs.getString("ple_marzo"));
                    ple.setAbril(rs.getString("ple_abril"));
                    ple.setMayo(rs.getString("ple_mayo"));
                    ple.setJunio(rs.getString("ple_junio"));
                    ple.setJulio(rs.getString("ple_julio"));
                    ple.setAgosto(rs.getString("ple_agosto"));
                    ple.setSeptiembre(rs.getString("ple_septiembre"));
                    ple.setOctubre(rs.getString("ple_octubre"));
                    ple.setNoviembre(rs.getString("ple_noviembre"));
                    ple.setDiciembre(rs.getString("ple_diciembre"));
                    v.setPle(ple);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al buscar por RUC los vencimientos: " + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }
        } finally {
            if (cn != null) {
                try {

                } catch (Exception e) {
                    System.out.println("Error al cerrar la conexion: " + e.getMessage());
                }
            }
        }
        return v;
    }

}
