package com.fatec.e2.model;

public class Calcado {
    private String marca;
    private String modelo;
    private int tamanho;
    private double preco;
    private String material;

    public Calcado() {}

    public String andar() {
        return "Estou andando no meu " + marca;
    }

    public boolean podeCorrer() {
        return marca.equals("adidas") || marca.equals("nike");
    }

    public String correr() {
        if (podeCorrer()) {
            return "Estou correndo no meu " + marca;
        } else {
            return andar();
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
