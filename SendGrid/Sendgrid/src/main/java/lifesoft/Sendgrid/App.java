package lifesoft.Sendgrid;
import com.sendgrid.*;
import java.io.IOException;

public class App 
{
	

	  public static void main(String[] args) throws IOException {
	    Email from = new Email("test@example.com");
	    String subject = "Sending with SendGrid is Fun";
	    Email to = new Email("armandocreyes02@gmail.com");
	    Content content = new Content("text/html", "<h1>Titulote</h1>");
	    Mail mail = new Mail(from, subject, to, content);

	    SendGrid sg = new SendGrid("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");
	    Request request = new Request();
	    try {
	      request.method = Method.POST;
	      request.endpoint = "mail/send";
	      request.body = mail.build();
	      Response response = sg.api(request);
	      System.out.println(response.statusCode);
	      System.out.println(response.body);
	      System.out.println(response.headers);
	    } catch (IOException ex) {
	      throw ex;
	    }
	  }
}
