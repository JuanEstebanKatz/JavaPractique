package com.jkatz.patrones;

public class ejemploSingleton {

	public static void main(String[] args) {
		com.jkatz.patroness.ConeccionBDsingleton con = null;
		
		for(int i =0; i<10; i++ ) {
			 con = com.jkatz.patroness.ConeccionBDsingleton.getInstancia();
			System.out.println("con:" + con);
		}

		com.jkatz.patroness.ConeccionBDsingleton con2 = com.jkatz.patroness.ConeccionBDsingleton.getInstancia();
		com.jkatz.patroness.ConeccionBDsingleton con3 = com.jkatz.patroness.ConeccionBDsingleton.getInstancia();
		boolean b1 = (con == con2)&& (con2 == con3) && (con == con3);
		
		System.out.println(b1);
	}
}
