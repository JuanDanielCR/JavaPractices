package automata.protocolo; 
public class AutomataProtocolo{
    public static void main(String[] args) {
        float is_encendido;
        int respues_automata;
        AutomataProt protocolo = new AutomataProt();
        do{
            is_encendido = (float) Math.random();
            respues_automata=protocolo.recibirProtocolo(is_encendido);
            System.out.println(respues_automata);
            if(respues_automata==0){
                System.out.println("El protocolo no recibio datos");
                break;
            }
        }while(is_encendido > 0.5);
        System.out.println("Adios!");
    }
}