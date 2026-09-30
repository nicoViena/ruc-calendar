package com.sistema_contable.Implements;

import com.sistema_contable.connections.ConnectionDB;
import com.sistema_contable.interfaces.IUsuarioDao;
import com.sistema_contable.model.Rol;
import com.sistema_contable.model.Usuario;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class UsuarioDaoImpl implements IUsuarioDao {

    private Connection cn;

    @Override
    public boolean insertar(Usuario u) {
        PreparedStatement st;
        String query = null;
        try {
            u.setRol(Rol.USUARIO);
            String hashPassword = u.HashPassword(u.getContraseña());
            query = "INSERT INTO usuario (usuario, clave, rol) "
                    + "VALUES (?, ?, ?)";
            cn = ConnectionDB.conectar();
            st = cn.prepareStatement(query);
            st.setString(1, u.getUsuario());
            st.setString(2, hashPassword);
            st.setString(3, u.getRol().name());
            st.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> lista = new ArrayList<>();
        Usuario u;
        PreparedStatement st;
        ResultSet rs;
        String query = null;
        try {
            query = "SELECT * FROM usuario ORDER BY id_usuario ASC";
            cn = ConnectionDB.conectar();
            st = cn.prepareStatement(query);
            rs = st.executeQuery();
            while (rs.next()) {
                u = new Usuario();
                u.setIdUsuario(rs.getInt("id_usuario"));
                u.setUsuario(rs.getString("usuario"));
                u.setContraseña(rs.getString("clave"));
                u.setRol(Rol.valueOf(rs.getString("rol")));
                lista.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public boolean editar(Usuario u) {
        PreparedStatement st;
        String query = null;
        try {
            String hashPassword = u.HashPassword(u.getContraseña());
            query = "UPDATE usuario SET usuario=?, clave=?, rol=? WHERE id_usuario=?";
            cn = ConnectionDB.conectar();
            st = cn.prepareStatement(query);
            st.setString(1, u.getUsuario());
            st.setString(2, hashPassword);
            st.setString(3, u.getRol().name());
            st.setInt(4, u.getIdUsuario());
            st.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean eliminar(int idUsuario) {
        PreparedStatement st;
        String query = null;
        try {
            query = "DELETE FROM usuario WHERE id_usuario=?";
            cn = ConnectionDB.conectar();
            st = cn.prepareStatement(query);
            st.setInt(1, idUsuario);
            st.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Usuario validarUsuario(String usuario, String password) {
        Usuario u = null;
        PreparedStatement st;
        ResultSet rs;
        String query = null;
        try {
            query = "SELECT * FROM usuario WHERE usuario=?";
            cn = ConnectionDB.conectar();
            st = cn.prepareStatement(query);
            st.setString(1, usuario);
            rs = st.executeQuery();
            if (rs.next()) {
                String hashGuardado = rs.getString("clave");
                Usuario temp = new Usuario();
                if (temp.verificarPassword(password, hashGuardado)) {
                    u = new Usuario();
                    u.setIdUsuario(rs.getInt("id_usuario"));
                    u.setUsuario(rs.getString("usuario"));
                    u.setRol(Rol.valueOf(rs.getString("rol")));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

}
