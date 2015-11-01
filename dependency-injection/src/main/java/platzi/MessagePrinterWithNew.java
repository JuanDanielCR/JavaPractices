package platzi;


public class MessagePrinterWithNew {
	
	/*
	 * Declaración de un variable tipo MessageService que es mi INTERFAZ.
	 * */
	
    private MessageService messageService;

    /*Constructor*/
    
    public MessagePrinterWithNew() {
    }
    
    /*Método que imprime el valor de getMessage
     * Como getMessage pertenece a la interfaz, este metodo de ser usado
     * en las clases que lo implementen con un @Override
     * */
    
    public void printMessage() {
        System.out.println(this.messageService.getMessage());
    }
    
    /*Setter para inyectar la dependencia, recibe un objeto de tipo Sad o Happy Message
     * ya que ambos implementan a la interfaz MessageService.
     */
    
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
    
    
}
