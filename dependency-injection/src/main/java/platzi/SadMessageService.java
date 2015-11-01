package platzi;

public class SadMessageService implements MessageService {
	/*Clase implementa a message service.
	 * */
	@Override
	public String getMessage() {
		return "No tan feliz :(";
	}

}
