package com.sistema_contable.model;

public class Vencimientos {
    private int idVencimientos;
    private int año;
    private int ultimo_digito;
    private String enero,febrero,marzo,abril,mayo,junio,julio,agosto,septiembre,octubre,noviembre,diciembre;
    private String vencimiento;
    private Cliente cliente;
    private PLE ple;

    public Vencimientos() {
    }

    public Vencimientos(int idVencimientos, int año, int ultimo_digito, String enero, String febrero, String marzo, String abril, String mayo, String junio, String julio, String agosto, String septiembre, String octubre, String noviembre, String diciembre, String vencimiento, Cliente cliente, PLE ple) {
        this.idVencimientos = idVencimientos;
        this.año = año;
        this.ultimo_digito = ultimo_digito;
        this.enero = enero;
        this.febrero = febrero;
        this.marzo = marzo;
        this.abril = abril;
        this.mayo = mayo;
        this.junio = junio;
        this.julio = julio;
        this.agosto = agosto;
        this.septiembre = septiembre;
        this.octubre = octubre;
        this.noviembre = noviembre;
        this.diciembre = diciembre;
        this.vencimiento = vencimiento;
        this.cliente = cliente;
        this.ple = ple;
    }

    public int getIdVencimientos() {
        return idVencimientos;
    }

    public void setIdVencimientos(int idVencimientos) {
        this.idVencimientos = idVencimientos;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getUltimo_digito() {
        return ultimo_digito;
    }

    public void setUltimo_digito(int ultimo_digito) {
        this.ultimo_digito = ultimo_digito;
    }

    public String getEnero() {
        return enero;
    }

    public void setEnero(String enero) {
        this.enero = enero;
    }

    public String getFebrero() {
        return febrero;
    }

    public void setFebrero(String febrero) {
        this.febrero = febrero;
    }

    public String getMarzo() {
        return marzo;
    }

    public void setMarzo(String marzo) {
        this.marzo = marzo;
    }

    public String getAbril() {
        return abril;
    }

    public void setAbril(String abril) {
        this.abril = abril;
    }

    public String getMayo() {
        return mayo;
    }

    public void setMayo(String mayo) {
        this.mayo = mayo;
    }

    public String getJunio() {
        return junio;
    }

    public void setJunio(String junio) {
        this.junio = junio;
    }

    public String getJulio() {
        return julio;
    }

    public void setJulio(String julio) {
        this.julio = julio;
    }

    public String getAgosto() {
        return agosto;
    }

    public void setAgosto(String agosto) {
        this.agosto = agosto;
    }

    public String getSeptiembre() {
        return septiembre;
    }

    public void setSeptiembre(String septiembre) {
        this.septiembre = septiembre;
    }

    public String getOctubre() {
        return octubre;
    }

    public void setOctubre(String octubre) {
        this.octubre = octubre;
    }

    public String getNoviembre() {
        return noviembre;
    }

    public void setNoviembre(String noviembre) {
        this.noviembre = noviembre;
    }

    public String getDiciembre() {
        return diciembre;
    }

    public void setDiciembre(String diciembre) {
        this.diciembre = diciembre;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public PLE getPle() {
        return ple;
    }

    public void setPle(PLE ple) {
        this.ple = ple;
    }
    
    
}
