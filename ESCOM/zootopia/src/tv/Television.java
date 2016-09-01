package tv;
public class Television {
    private int vol;
    private int channel;
    private boolean turnOn;
    private int validChannels[];    
    //constructor carece del tipo de retorno
    public Television() {
        turnOn = false;
        vol = 20;
        channel = 7;
        validChannels =new int[]{2,5,7,9,11};
    }
    //Imprimiendo el estado
    @Override
    public String toString() {
        String cad = "Television{" +"estado=" + turnOn + ", vol=" + vol + ", channel=" + channel +  '}';
        for(int i = 0; i<validChannels.length; i++){
            cad += validChannels[i]+" ";
        }
        return cad;
    }
    //Encendido/Apagado
    public void setTurnOn() {
        turnOn = !turnOn;
    }
    public boolean isTurnOn() {
        return turnOn;
    } 
    //Cambiando el canal
    public void setChannel (int channel){
        boolean status=false;
        if(turnOn==true){
            for(int i=0; i<validChannels.length;i++){
                if(channel == validChannels[i]){
                    this.channel=channel;
                    status = true;
                    break;
                }
            }
        if(status == false){
            System.out.println("Canal invalido");    
        }
        }else{
            System.out.println("Estoy apagada");
        }
    }
    public void arribaCanal(){
        int canal_actual=0;
        if(turnOn==true){
            for(int i=0; i< validChannels.length; i++){
                if(validChannels[i] == channel){
                    canal_actual=i;
                    break;
                }
            }
            if(canal_actual == validChannels.length-1){
                channel = validChannels[0];
            }else{
                channel = validChannels[++canal_actual];
            }
        }else{
            System.out.println("Estoy apagada");
        }
    }
    public void abajoCanal(){
        int canal_actual=0;
        if(turnOn==true){
            for(int i=0; i< validChannels.length; i++){
                if(validChannels[i] == channel){
                    canal_actual=i;
                    break;
                }
            }
            if(canal_actual == 0){
                channel = validChannels[validChannels.length-1];
            }else{
                channel =  validChannels[--canal_actual];
            }
        }else{
            System.out.println("Estoy apagada");
        }
    }
    public int getChannel() {
        return channel;
    }
    //Volumen
    public void setVolUp() {
        if (turnOn==true && (vol>=0 || vol<=100 )){
            vol++;
        }
        else{
            this.vol=100;
        }
    }
    public void setVolDown() {
        if (turnOn==true && (vol>=0 || vol<=100 )){
            vol--;
        }
        else{
           this.vol=0;
        }   
    }   
    public int getVol() {
        return vol;
    }
}