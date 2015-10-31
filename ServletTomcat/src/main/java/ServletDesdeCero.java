
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet es una "anotation", esto es metadata que le dice al servidor que esto es un servlet
@WebServlet("/ServletCero")
public class ServletDesdeCero extends HttpServlet{
    
    //Implementar lo service Methods - Son los metodos http manejados desde Java
    //@Override tambien es metadata
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    //Recuperando data por medio de un get, (URL)
        String message= request.getParameter("message");
        //Espicificar el tipo de Contenido a enviar
        response.setContentType("application/json");
    //PrintWritter es un Writter que nos permite escribir la respuesta, out=response.getWritter el objeto response me da un Writter válido
        //System.out.print(); es un writer para el System
        //En este caso out es un writter para el response
         try(PrintWriter out= response.getWriter()){
         out.print("{\"message\": \"" + message + "\"}");
         
         }
         //Cerrar el Writter *Si uso try(){} no es necesario cerrar, de otra forma usar
         /*
            PrintWriter out= response.getWriter();
            out.print("{\"message\": \"" + message + "\"\"}");
            out.flush(); o out.close();
         */
    }
    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //POST usado en servicios rest
        //Ahora obtenemos un body en la peticion, ya no obtenemos parametros en la url, ej. cuando nos registramos 
        //en un formulario al poner method="POST"
        String linea;
        //StringBuffered va almacenando bits en formato String
        StringBuilder json= new StringBuilder();
        //BufferedReader va almacenando los bits mandandos y leidos por el req.getReader
        try(BufferedReader reader = request.getReader()){
            //El String linea = pasa los bits leidos y guardados el buffer a un formato String
            while((linea=reader.readLine())!=null){
                //Mandamos cada liena a un Buffered para ser guardado
                json.append(linea);
            }
            System.out.println(json.toString());
            //Tratamiento al JSON recibido usar jackson en el POM
            ObjectMapper mapper= new ObjectMapper();
            //CLASE que cree message=convierte este json en un Message.class
            Message message= mapper.readValue(json.toString(),Message.class);
            System.out.println(message.getSize()+" msj: "+message.getMessage());
            response.setContentType("text/html;charset=UTF-8");
            try(PrintWriter out= response.getWriter()){
                out.print("Este es el response dentro de un objeto PrintWriter");
            }
        }
    }
}
