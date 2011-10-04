package com.sergialmar.springpuzzlers.sp01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bootstrap class for Spring Puzzler #01: Welcome
 * 
 * What will be the output after running this class?
 * 
 * 1.- Welcome to Spring Puzzlers Sergi
 * 2.- NoSuchBeanDefinitionException will be thrown during initialization as there's more than one bean of the same type to be injected
 * 3.- Bienvenido a Spring Puzzlers Sergi
 * 4.- NullPointerException will be thrown at runtime
 * 
 * @author Sergi Almar i Graupera
 */
public class WelcomeBootstrap {
	
	public static void main(String... args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/sergialmar/springpuzzlers/sp01/applicationContext.xml");
		
		WelcomeService welcomeService =	applicationContext.getBean(WelcomeService.class);
		
		welcomeService.welcome("Sergi");
	}
}