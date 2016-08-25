import java.util.ArrayList;
public class Saludo{

	public static void main(String[] args) {
		 int value = 5;
		 for (int i = 0; i < Math.pow(2, value); i++) {
		 StringBuilder binary = new StringBuilder(Integer.toBinaryString(i));
		 System.out.println("Antes: "+binary+ "binary - length: "+binary.length());
		 for(int j = binary.length(); j < value; j++) {
				 binary.insert( 0, '0' );
		 }
		 System.out.println("Despues:"+binary);
 	}
}
}
