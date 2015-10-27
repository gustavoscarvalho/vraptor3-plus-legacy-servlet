package br.com.modelo;

import br.com.caelum.vraptor.ioc.Component;


public class Carro {
	private String modelo = "Gol";
	private String proprietario = "Teste";
	private int ano = 2014;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
