package com.fatec.e2.model;

public class AlunoFatecSJC extends Pessoa {
    private String ra;
	private double mediaNota;
	private int semestreAtual;
	
	
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getMediaNota() {
        return mediaNota;
    }

    public void setMediaNota(double mediaNota) {
        this.mediaNota = mediaNota;
    }

    public int getSemestreAtual() {
        return semestreAtual;
    }

    public void setSemestreAtual(int semestreAtual) {
        this.semestreAtual = semestreAtual;
    }

	
	public AlunoFatecSJC() {
		super();
	}
	
	public void passaDeSemestre() {
		this.semestreAtual += 1;
	}
	
	public void calculaMedia(double nota1, double nota2,
		double nota3, double nota4) {
			this.mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
	public String pedeDescontoNoCinema() {
		return "Moço, posso pagar meia? Sou estudante!!";
	}
}
