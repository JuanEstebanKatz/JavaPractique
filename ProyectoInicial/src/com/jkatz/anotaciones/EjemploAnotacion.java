package com.jkatz.anotaciones;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;


public class EjemploAnotacion {
	
	public static void main(String[] args) {
		
		Producto p = new Producto();
		p.setFecha(LocalDate.now());
		p.setNombre("Mesa centro de roble");
		p.setPrecio(444l);
		Field[] atributos = p.getClass().getDeclaredFields();
		
		String json = Arrays.stream(atributos)
		.filter(f -> f.isAnnotationPresent(JsonAtributo.class))
		.map(f -> { 
			f.setAccessible(true);
			String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
					? f.getName()
					: f.getAnnotation(JsonAtributo.class).nombre();
			try {
				return "\"" + nombre + "\":\""+f.get(p)+"\"";
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException("Error a serializar a JSON" +e.getMessage());
			}
		})
		.reduce("{",(a,b)-> {
			if("{".equals(a)) {
				return a+b;
			}
			return a + ", "+b;
		}).concat("}");
		
	System.out.println("json = " + json);
	}

}
