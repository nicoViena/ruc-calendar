package com.sistema_contable.model;

public class Cliente {
    private int idCliente;
    private String RUC;
    private String nombre;

    public Cliente() {
    }

    public Cliente(int idCliente, String RUC, String nombre) {
        this.idCliente = idCliente;
        this.RUC = RUC;
        this.nombre = nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
