package com.jkatz.recursividad;

import java.util.stream.Stream;

public class EjemploRecursividad {

	public static void main(String[] args) {
		
		Componente pc = new Componente("Gabinete PC ATX");
		Componente poder = new Componente("Fuente poder 700w");
		Componente placaMadre = new Componente("MainBoard Aus Socket AMD");
		Componente cpu = new Componente("Cpu Amd Ryzen 5 2800");
		Componente ventilador = new Componente("Ventilador CPu");
		Componente disipador = new Componente("Disipador ");
		Componente tv = new Componente("Nvidia RTX 3080 8Gb ");
		Componente gpu = new Componente("Nvidia RTX 2090 8GB");
		Componente gpuRam = new Componente("4Gb Ram");
		Componente gpuRam2 = new Componente("4Gb Ram");
		Componente gpuVentiladores = new Componente("Ventiladores");
		
		
		cpu.addComponente(ventilador).addComponente(disipador);
		
		tv.addComponente(gpu).addComponente(gpuRam)
							 .addComponente(gpuRam2)
							 .addComponente(gpuVentiladores);
		
		placaMadre.addComponente(gpu)
				  .addComponente(tv)
				  .addComponente(cpu);
		
		pc.addComponente(poder).addComponente(placaMadre)
		.addComponente(new Componente("raton"))
		.addComponente(new Componente("mouse"));
			
		metodoRecursivo(pc, 0);
		
	//	metodoRecursivoStream(pc, 0)
	//	.forEach(c -> System.out.println("\t".repeat(c.getNivel())+c.getNombre()));
		
	}
	
	public static Stream metodoRecursivoStream(Componente c, int nivel) {
		c.setNivel(nivel);
		
		//tengo el padre con stream of c, luego los hijos 
		return Stream.concat(Stream.of(c),
				c.getHijos().stream()
				.flatMap(hijo -> metodoRecursivoStream (hijo,nivel+1)));
	}
	
	
	public static void metodoRecursivo(Componente c, int nivel) {
		System.out.println("\t".repeat(nivel)+c.getNombre());
		if(c.tieneHijos()) {
			for (Componente hijo : c.getHijos()) {
				metodoRecursivo(hijo, nivel +1);
			}
		}
	}
}
