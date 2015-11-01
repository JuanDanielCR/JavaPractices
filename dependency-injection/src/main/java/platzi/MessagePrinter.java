package platzi;
/*Este MessagePrinter hace lo mismo que el MessagePrinterWithNew pero
 * se nota que aqui no usamos new, y por lo tanto no creamos objetos.
 * 
 * Ahora los new y los objetos se crean en la CLASE DE CONFIGURACIÓN
 * 
 * Espera que sus dependencias lleguen de alguna forma, las depedencias llegarán
 * ya que el hace parte de un contexto, que es el ApplicationContext de Spring*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*Componente al que le debo inyectar dependencias, también puedes inyectarme a mí en
 * otro lados*/

@Component
public class MessagePrinter {
	
    final private MessageService service;
    
    /*@Autowired anotación para inyectar las dependencias, por medio de un constructor,
     * en este caso.*/
    
    @Autowired
    
    /*En este Constructor se inyectan las dependencias de MessageService a this.service*/
    
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
