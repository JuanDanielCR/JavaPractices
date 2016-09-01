package automata.paridad;

public class Automata {
    private int q;
    public Automata(){
        q=0;
    }
    public boolean calcularParidad(String cadena){
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
            }
        }
        //if not redundant
        return q==0;
    }
}