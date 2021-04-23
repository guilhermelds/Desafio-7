package Senai;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		System.out.println("--- Sistema de Eventos---");
		Usuario usuario1 = new Usuario("joão");
		Usuario usuario2 = new Usuario("Maria");
		Usuario usuario3 = new Usuario("Pedro");
		Usuario usuario4 = new Usuario("José");
		
		System.out.println("---Evento 1---");
		Evento evento1 = new EventoPresencial("Java para Iniciantes", LocalDate.of(2020, 11, 16), usuario1, "fpols", 20);
		evento1.addParticipante(usuario2);
		
		System.out.println("---Evento 2---");
		EventoVirtual evento2 = new EventoVirtual("Corte e custura", LocalDate.of(2020, 12, 14), usuario2, "http//: www.xttudo.com");
		
		evento2.addParticipante(usuario1);
    	evento2.addParticipante(usuario2);
    	evento2.addParticipante(usuario3);
    	evento2.addParticipante(usuario4);
		evento2.removeParticipante(usuario2);
		evento2.removeParticipante(usuario3);
		evento2.addParticipante(usuario2);
		
//		evento2.addParticipante(usuario1);
//		evento2.removeParticipante(usuario2);
//		evento2.removeParticipante(usuario1);
//		evento2.removeParticipante(usuario3);
//		evento2.removeParticipante(usuario4);
		
		System.out.print("fim");
		

	}

}
