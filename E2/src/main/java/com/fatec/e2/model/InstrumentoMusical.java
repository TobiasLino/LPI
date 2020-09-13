package com.fatec.e2.model;

public class InstrumentoMusical {
    private String tipo;
    private boolean possuiCordas;
    private String afinacao;

    public InstrumentoMusical() {}

    public String tocar() {
        return "Estou tocando uma... música po";
    }
    public String parar() {
        return "Parei de Tocar!";
    }

    public String guardar() {
        return "Ah não, vai que eu toco denovo!";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isPossuiCordas() {
        return possuiCordas;
    }

    public void setPossuiCordas(boolean possuiCordas) {
        this.possuiCordas = possuiCordas;
    }

    public String getAfinacao() {
        return afinacao;
    }

    public void setAfinacao(String afinacao) {
        this.afinacao = afinacao;
    }
}
