package com.fatec.e2.model;

public class Lugar {
    private String rua;
    private String numero;
    private String cidade;
    private String bairro;
    private String uf;
    private String cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Lugar(String cep) {
        this.cep = cep;
    }


    public Lugar() {}

    public String imHere() {
        return "Hello, i'm in " + getCidade();
    }

    public String moroAqui() {
		return "Moro aqui, em " + getCidade();
	}
}
