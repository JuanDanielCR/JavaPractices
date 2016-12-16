
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.SparkBase.port;
import static spark.SparkBase.staticFileLocation;
import spark.template.freemarker.FreeMarkerEngine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Daniel
 */
public class Main {
    public static void main(String[] args) {
        
    // Descomentar para heroku ----port(Integer.valueOf(System.getenv("PORT")));
   staticFileLocation("/public");

    post("/lang", (req, res) -> {
        String val=req.queryParams("idioma");
        int lang;
        String respuesta;
        lang= Integer.parseInt(val);
        if(lang==1){
            respuesta="<h1>Ingles</h1>";
        }else{
            if(lang==2){
                respuesta="<h1>Italiano</h1>";
            }else{
                respuesta="<h1>Aleman</h1>";
                ////ACENTOS cambiar POM
                /*
                <project>
    ...
    <build>
        <plugins>
            ...
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    ...
                    <encoding>ISO-8859-1</encoding>
                </configuration>
            </plugin>
        </plugins>
    </build>
    ...
</project>
                */
            }
        }
        return respuesta;
    });

    get("/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("name", "Juan Daniel CR");

            return new ModelAndView(attributes, "index.ftl");
        }, new FreeMarkerEngine());
    }
}
