package com.sistema_contable.interfaces;

import java.util.List;
import com.sistema_contable.model.Cliente;

public interface IClienteDao {
    public boolean insertar(Cliente c);
    public List<Cliente> listar();
    public boolean editar(Cliente c);
    public boolean eliminar(Cliente c);
    public Cliente BuscarPorRUC(String RUC);
}
