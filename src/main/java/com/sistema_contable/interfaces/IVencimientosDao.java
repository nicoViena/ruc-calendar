package com.sistema_contable.interfaces;

import com.sistema_contable.model.Vencimientos;
import java.util.List;

public interface IVencimientosDao {
    public List<Vencimientos> buscarPorPeriodo(String mesColumna, int año);
    public Vencimientos buscarPorRUC(String ruc, int año, String tipo);
}
