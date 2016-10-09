package sources;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Scanning {
	private Scanner input = null;
	
	public Scanning(){
		input = new Scanner(System.in);
		input.useLocale(Locale.US);
	}
	
	public void getCharacter(){
		char c,limit;
		limit = System.lineSeparator().charAt(0);
		System.out.println("Ingresa:");
		Pattern p = Pattern.compile(".*?", Pattern.MULTILINE);
		input.useDelimiter(p);
		while(input.hasNext()){
			c = input.next().charAt(0);
			System.out.println(c);
			if(c==limit){
				break;
			}
		}
	}
	
}
