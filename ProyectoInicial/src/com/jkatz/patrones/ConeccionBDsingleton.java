package com.jkatz.patroness;

public class ConeccionBDsingleton {

	private static ConeccionBDsingleton instanceConeccionBD;
	
	private ConeccionBDsingleton() {
		System.out.println("Conectandose a bd......");
	}
	
	public static ConeccionBDsingleton getInstancia () {
		
		if(instanceConeccionBD == null) {
			instanceConeccionBD = new ConeccionBDsingleton();
		}
		return instanceConeccionBD;
	}
}
