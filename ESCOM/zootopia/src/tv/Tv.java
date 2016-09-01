package tv;
public class Tv {
    public static void main(String[] args) {
        //Instancia de mi television
        Television miTV=new Television();
        miTV.setTurnOn();
        miTV.setChannel(2);
        System.out.println(miTV.getChannel());
        miTV.abajoCanal();
        System.out.println(miTV.getChannel());

    }   
}