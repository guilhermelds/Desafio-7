package Senai;

import java.time.LocalDate;

public class EventoPresencial extends Evento {
	
	private String localizašao;
	private int capacidadeMaxima;
	
	public EventoPresencial(String nome, LocalDate data, Usuario organizador, String localizašao,
			int capacidadeMaxima) {
		super(nome, data, organizador);
		this.localizašao = localizašao;
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public String getLocalizašao() {
		return localizašao;
	}

	public void setLocalizašao(String localizašao) {
		this.localizašao = localizašao;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	
	
	
	

}
