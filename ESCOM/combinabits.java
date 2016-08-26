public class combinabits{

	public static void main(String[] args) {
		 int value = 40;
		 StringBuilder binary = new StringBuilder("");
		 for (int i = 0; i < Math.pow(2, value); i++) {
			 binary.insert(0, Integer.toBinaryString(i));
			 for(int j = binary.length(); j < value; j++) {
					 binary.insert( 0, '0' );
			 }
			 System.out.print("{"+binary+"},");
			 int largo_combinacion = binary.length();
			 for(int k = 0; k < largo_combinacion; k++) {
				 binary.deleteCharAt(0);
			 }
 		}
	}
}
