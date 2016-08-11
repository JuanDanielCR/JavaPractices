class Operadores{
  public static void main(String []args){
  /*Operadores de corrimiento*/
    int x = -128;
    int y = 4;
    int corrido = x>>y;
    System.out.println("-128 >> 4 = "+corrido);
    // El triple corrimiento toma el bit del signo.
    int ternario = x>>>y;
    System.out.println("-128  >>> 4 = "+ternario);
    // << duplicador >> divisor usando 2

  //Operador de inversion...
  //Operador de modulo %
    int entero  = 89;
    int divisor = 3;
    int modulo = entero % divisor;

    System.out.println("89 % 3 = "+modulo);

  //Operador de Corto Circuito.- Son llamados así ya que una vez que se cumple alguna de sus condiciones, el resto ya no se evalua.
    //  || && trabajan con boolenos y enteros
    boolean a = true;
    boolean b = false;
    boolean c = false;
    // c = true no se evaluará.
    boolean res = (a!=b) || (b == false) || (c=true);
    System.out.println("res = " + res + " c = "+c);
    // | &, cuando los operadores son simples solo trabajan con boolean y evalua la exp. completa

    boolean simple1 = true;
    boolean simple2 = true;

    // simple2 si cambiará su valor
    boolean total = (simple1 == simple2) | (simple2 = false);
    System.out.println("Simple 2 (debe ser falso) = "+simple2);

    // ^ or exclusiva.- valores diferente da true
    boolean verdad = true;
    boolean falso =  false;
    //Son diferentes
    boolean exclusivo = (verdad==falso) ^ (verdad == true);
    System.out.println("exclusivo = "+exclusivo);


  }
}
