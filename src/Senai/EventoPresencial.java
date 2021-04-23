package Senai;

import java.time.LocalDate;

public class EventoPresencial extends Evento {
	
	private String localizaçao;
	private int capacidadeMaxima;
	
	public EventoPresencial(String nome, LocalDate data, Usuario organizador, String localizaçao,
			int capacidadeMaxima) {
		super(nome, data, organizador);
		this.localizaçao = localizaçao;
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public String getLocalizaçao() {
		return localizaçao;
	}

	public void setLocalizaçao(String localizaçao) {
		this.localizaçao = localizaçao;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	
	
	
	

}
