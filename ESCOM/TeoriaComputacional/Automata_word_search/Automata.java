package automata.ing;

public class Automata {
    //Automata
    public boolean automataAnalisis(String palabra){
        int q=0;
        for(int i=0; i < palabra.length(); i++){
            switch(palabra.charAt(i)){
                case 'i':
                    q=1;
                break;
                case 'n':
                    if(q==1){ q=2;}else{q=0;}
                break;
                case 'g':
                    if(q==2){ q=3; }else{ q=0;}
                break;
                case ' ':
                    if(q==3){ q=4;}
                break;
                default:
                    q = 0;
                break;
            }
        }
        return q == 4;
    }
}