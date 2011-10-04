package com.sergialmar.springpuzzlers.sp01;

import javax.inject.Named;

/**
 * 
 * @author Sergi Almar i Graupera
 */
@Named
public class EnglishWelcomePrinter implements LocalizedWelcomePrinter {

	public void printWelcome(String name) {
		System.out.println("Welcome to Spring Puzzlers " + name);
	}
}
