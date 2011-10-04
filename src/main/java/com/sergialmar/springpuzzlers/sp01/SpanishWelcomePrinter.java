package com.sergialmar.springpuzzlers.sp01;

/**
 * 
 * @author Sergi Almar i Graupera
 */
public class SpanishWelcomePrinter implements LocalizedWelcomePrinter {

	public void printWelcome(String name) {
		System.out.println("Bienvenido a Spring Puzzlers " + name);
	}
}
