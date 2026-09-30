package com.sistema_contable.interfaces;

import com.sistema_contable.model.Usuario;
import java.util.List;

public interface IUsuarioDao {
    public boolean insertar(Usuario u);
    public List<Usuario> listar();
    public boolean editar(Usuario u);
    public boolean eliminar(int idUsuario);
    Usuario validarUsuario(String usuario, String password);
}
