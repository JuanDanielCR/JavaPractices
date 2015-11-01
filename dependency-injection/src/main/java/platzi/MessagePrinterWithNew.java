package platzi;


public class MessagePrinterWithNew {
	
	/*
	 * Declaraci�n de un variable tipo MessageService que es mi INTERFAZ.
	 * */
	
    private MessageService messageService;

    /*Constructor*/
    
    public MessagePrinterWithNew() {
    }
    
    /*M�todo que imprime el valor de getMessage
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
