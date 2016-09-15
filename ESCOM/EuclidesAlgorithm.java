import java.util.Scanner;
public class EuclidesAlgorithm{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int continuar = 0;
		int m;
		int n;
		int result;
		do{
			System.out.print("m: ");
			m = sc.nextInt();
			System.out.print("n: ");
			n = sc.nextInt();
			result = euclides(m,n);
			System.out.println("\n Result: "+result);
			System.out.println("continuar? No:0 ");
			continuar = sc.nextInt();
		}while(continuar > 0);
	}
	private static int euclides(int m, int n){
		int result = -1;
		int reminder;
		while(n > 0){
			reminder = m%n;
			if(reminder == 0){
				result = n;
				break;
			}else{
				m = n;
				n = reminder;
			}
		}
		return result;
	}
}