package platzi;

import org.springframework.beans.factory.annotation.Autowired;

public class TestClass {
	
	public static void main(String[] args) {
		MessagePrinterWithNew printer = new MessagePrinterWithNew();
		/*
		 * La clase MessagePrinterWithNew depende de MessageHappy o MessageSad
		 * Estoy Injectando Happy o Sad desde un setter, de esta forma puedo usar
		 * cualquiera de los dos sin necesidad de cambiar el codigo directo en la
		 * clase dependiente. 
		 * */
		printer.setMessageService(new SadMessageService());
		/*Setter con el que mando un objeto de la dependencia que inyectare*/
		printer.printMessage();
	}

}
