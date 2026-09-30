package com.sistema_contable.Implements;

import com.sistema_contable.connections.ConnectionDB;
import com.sistema_contable.interfaces.IClienteDao;
import com.sistema_contable.model.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoImpl implements IClienteDao {

    private Connection cn;

    @Override
    public boolean insertar(Cliente c) {
        PreparedStatement st;
        boolean flag = false;
        String query = null;
        try {
            query = "INSERT INTO cliente(ruc,nombre)"
                    + " VALUES (?,?)";
            cn = ConnectionDB.conectar();
            st = cn.prepareStatement(query);
            st.setString(1, c.getRUC());
            st.setString(2, c.getNombre());
            //ejecutar la consulta de inserccion
            st.executeUpdate();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error de insercion: " + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }
            flag = false;
        } finally {
            if (cn != null) {
                try {

                } catch (Exception e) {
                    System.out.println("Error al cerrar la conexion: " + e.getMessage());
                }
            }
        }
        return flag;
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> lista = null;
        Cliente cl;
        PreparedStatement st;
        ResultSet rs;
        String query = null;
        try {
            query = "SELECT * FROM cliente";
            lista = new ArrayList<>();
            cn = ConnectionDB.conectar();
            st = cn.prepareStatement(query);
            rs = st.executeQuery();
            while (rs.next()) {
                cl = new Cliente();
                cl.setIdCliente(rs.getInt("id_cliente"));
                cl.setRUC(rs.getString("ruc"));
                cl.setNombre(rs.getString("nombre"));
                lista.add(cl);
            }
        } catch (Exception e) {
            System.out.println("Error de lista del cliente: " + e.getMessage());
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
        return lista;
    }

    @Override
    public boolean editar(Cliente c) {
        PreparedStatement st;
        boolean flag = false;
        String query = null;
        try {
            query = "UPDATE cliente SET ruc=?, nombre=? WHERE id_cliente=?";
            cn = ConnectionDB.conectar();
            st = cn.prepareStatement(query);
            st.setString(1, c.getRUC());
            st.setString(2, c.getNombre());
            st.setInt(3, c.getIdCliente());
            //ejecutar la consulta de inserccion
            st.executeUpdate();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error de actualizacion de cliente: " + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }
            flag = false;
        } finally {
            if (cn != null) {
                try {

                } catch (Exception e) {
                    System.out.println("Error al cerrar la conexion: " + e.getMessage());
                }
            }
        }
        return flag;
    }

    @Override
    public boolean eliminar(Cliente c) {
        PreparedStatement st;
        boolean flag = false;
        String query = null;
        try {
            query = "DELETE FROM cliente WHERE id_cliente=?";
            cn = ConnectionDB.conectar();
            st = cn.prepareStatement(query);
            st.setInt(1, c.getIdCliente());
            //ejecutar la consulta de inserccion
            st.executeUpdate();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error al eliminar un cliente: "+e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }
            flag = false;
        } finally {
            if (cn!=null) {
                try {
                    
                } catch (Exception e) {
                    System.out.println("Error al cerrar la conexion: "+e.getMessage());
                }
            }
        }
        return flag;
    }

    @Override
    public Cliente BuscarPorRUC(String RUC) {
        Cliente cl=null;
        PreparedStatement st;
        ResultSet rs;
        String query = null;
        try {
            query = "SELECT * FROM cliente WHERE ruc=?";
            cn = ConnectionDB.conectar();
            st = cn.prepareStatement(query);
            st.setString(1, RUC);
            rs= st.executeQuery();
            if (rs.next()) {                
                cl=new Cliente();
                cl.setIdCliente(rs.getInt("id_cliente"));
                cl.setRUC(rs.getString("ruc"));
                cl.setNombre(rs.getString("nombre"));
            }
        } catch (Exception e) {
            System.out.println("Error de lista del cliente: " + e.getMessage());
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
        return cl;
    }

}
