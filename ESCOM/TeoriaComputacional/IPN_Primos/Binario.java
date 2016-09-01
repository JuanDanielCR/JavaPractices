package teoriaprimos;
public class Binario {
    private String cadena_entrada;
    private String binario="";

    public void setCadena_entrada(String cadena_entrada) {
        this.cadena_entrada = cadena_entrada;
    }

    public String getBinario() {    
        byte[] bytes = cadena_entrada.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes)
        {
           int val = b;
           for (int i = 0; i < 8; i++)
           {
             //operador logico and (&) para valores iguales imprime 0 para diferentes imprime 1
              binary.append((val & 128) == 0 ? 0 : 1);
              val <<= 1;
           }
        }
        binario =  binary.toString();
        return binario;
    }
}
