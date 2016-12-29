import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegExp {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("EJ. Visa(1.0).pdf - Escribe:");
		//[a-zA-Z_0-9] = \w
		Pattern p =  Pattern.compile("(\\w+)\\(\\d+\\.\\d+\\)\\.(\\w+)");
		Matcher m =  p.matcher(sc.nextLine());
		if(m.find()){
			System.out.println("Si pasa");
		}else{
			System.out.println("No pasa");
		}
		sc.close();
	}
}
