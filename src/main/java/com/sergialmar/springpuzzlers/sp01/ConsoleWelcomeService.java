package com.sergialmar.springpuzzlers.sp01;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * WelcomeService implementation that prints the welcome message on the console
 * 
 * @author Sergi Almar i Graupera
 */
@Named
public class ConsoleWelcomeService implements WelcomeService {

	/**
	 * Notice that this field is static. Static fields are omitted during
	 * dependency injection. The SpanishWelcomePrinter will be the
	 * implementation used in this case
	 */
	@Inject
	private static LocalizedWelcomePrinter printer = new SpanishWelcomePrinter();

	public void welcome(String name) {
		printer.printWelcome(name);
	}
}
