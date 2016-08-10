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
    }
}
