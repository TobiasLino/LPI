package com.fatec.e2.model;

public class Pessoa {
    private String name;
    private int age;
    private String gender;
    private Lugar endereco;
    private String naturalidade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Lugar getEndereco() {
        return endereco;
    }

    public void setEndereco(Lugar endereco) {
        this.endereco = endereco;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Pessoa(String name) {
        this.name = name;
    }

    public Pessoa() {}

    public String talk() {
        return "hello dear friend!";
    }

    public String reason() {
        return "To be or not to be, that's the question!";
    }

    public boolean hateForeigners() {
        if (this.naturalidade != null && this.naturalidade.equals("americano")) {
            return true;
        }
        return false;
    }
}
