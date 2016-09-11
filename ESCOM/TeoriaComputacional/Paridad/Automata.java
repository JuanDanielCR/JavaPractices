package automata.paridad;

public class Automata {
    private int q;
    public boolean calcularParidad(String cadena){
        q=0;
        for(int i=0; i < cadena.length(); i++){
            switch(cadena.charAt(i)){
                case '0':
                    if(q==0){
                        q=1;
                    }else if(q==1){
                        q=0;
                    }else if(q==2){
                        q=3;
                    }else if(q==3){
                        q=2;
                    }
                break;
                case '1':
                    if(q==0){
                        q=2;
                    }else if(q==2){
                        q=0;
                    }else if(q==1){
                        q=3;
                    }else if(q==3){
                        q=1;
                    }
                break;
                default:
                    q=4;
                    System.out.println("Simbolo no válido");
                break;
            }
        }
        //if not redundant
        return q==0;
    }
}