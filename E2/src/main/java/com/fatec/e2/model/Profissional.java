package com.fatec.e2.model;

public class Profissional extends Pessoa {
    private String ctps;
    private Boolean isEmployed;
    private String area;
    private Boolean haveXP;
    private String degree;

    public Profissional() {}

    public String toWork() {
        return "I'm really doing stuff, do not bother!!";
    }

    public String vacation() {
        return "I'm fine bro!";
    }

    public double bePaid() {
        return 2500.32;
    }


    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public Boolean getEmployed() {
        return isEmployed;
    }

    public void setEmployed(Boolean employed) {
        isEmployed = employed;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Boolean getHaveXP() {
        return haveXP;
    }

    public void setHaveXP(Boolean haveXP) {
        this.haveXP = haveXP;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
