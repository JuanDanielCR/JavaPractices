package lifesoft.Sendgrid;
import com.sendgrid.*;
import java.io.IOException;

public class App 
{
	

	  public static void main(String[] args) throws IOException {
	    Email from = new Email("test@example.com");
	    String subject = "Sending with SendGrid is Fun";
	    Email to = new Email("castilloreyesjuan@gmail.com");
	    Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
	    Mail mail = new Mail(from, subject, to, content);

	    SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
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
