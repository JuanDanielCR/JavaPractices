import java.util.Properties;
import java.util.Arrays;
import java.io.*;
public class java_properties{
    public static void main(String[] args) {
      //create and load default Properties
      Properties propiedades = new Properties();
      try{
        FileInputStream in = new FileInputStream("defaultProperties");
        propiedades.load(in);

        System.out.println(java.util.Arrays.asList(propiedades.elements()));

        //Closing the stream
        in.close();
      }catch(Exception e){
        System.out.println(e.toString());
      }
    }
}
