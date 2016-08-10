public class Main {
    public static void main(String []args){
        int a = 10;
        int b = 9;
        int c = 8;
        int d = 100000;
        short octal = 043;
        long hexadecimal = 0xF1;
        byte mayor = 127;

        System.out.println("a= "+a+"\nb= "+b+"\nc= "+"\nd= "+d);
        System.out.println("Octal = "+octal+"\n Hexadecimal= "+hexadecimal+"\n byte= "+mayor);

        //byte y short se promueve a int, o realizar un casting
        int promovido = octal+mayor;

        long exponente = (long) 100E6;
        System.out.println(promovido);

        //UNICODE {0-65535} ASCII {0-256} char = 2bytes
        char c1 = '@';
        char c2 = 64;

        System.out.println("c1: "+c1+" c2: "+c2);

        boolean b2 = true;
        //primero asignacion, luego eval
        if(b5 = true){
          System.out.println("b5="+b5);
        }

        //float 4 bytes
        float f = 1.2E6f;
        float small = (float) 1.5;
        float maximo = Float.MAX_VALUE;
        float maximo_desbordado = maximo*maximo;

        System.out.println(maximo);
        System.out.println(maximo_desbordado);

        //En java un numero con punto decimal es double
        double calif = 9.5;
                double d1 = 5.3;
        double d2 = 2.6;
        System.out.println("d1%d2: "+d1%d2);
    }
}
