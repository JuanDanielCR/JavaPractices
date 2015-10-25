
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
        super.doPost(request, response);
    }
}
