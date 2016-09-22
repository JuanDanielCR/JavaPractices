package prueba;

import java.util.Calendar;
import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Prueba{
	private static boolean dateFormat;
	private static boolean dateValue;
	private static String date;
	private static String[] parts;

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int status;
	      	//Date Format
	    do{
	        System.out.println("Fecha Nacimiento mm/dd/yyyy (12/25/1997): ");
	        date = sc.next();
	        dateFormat = setDateFormatFilter(date);
	        System.out.println("Formato correcto: "+dateFormat);
	        if(dateFormat == true){
	       	   	dateValue = setDateValueFilter(date);
	        	System.out.println("Rango correcto: "+dateValue);
	        }
	    }while(dateFormat == false || dateValue == false);

	    status = setDates();
	}

	public static boolean setDateFormatFilter(String date){
    boolean correctFormatDate = false;
    	//formato: MM/dd/YYYY ej 03/17/1997
	    String pattern = "^[0-9]{2}/[0-9]{2}/[0-9]{4}$";
	    Pattern r = Pattern.compile(pattern);
	    Matcher m = r.matcher(date);
	    if(m.find()){
	      setDateValueFilter(date);
	      correctFormatDate = true;
	    } 
	    return correctFormatDate;
 	 }

  public static boolean setDateValueFilter(String date){
    boolean correctValueDate = false;
      parts = date.split("/");
      int year_validation = Integer.parseInt(parts[2]);
      int month_validation = Integer.parseInt(parts[0]);
      int day_validation = Integer.parseInt(parts[1]);
      if(year_validation<=2016 && 0<month_validation && month_validation<13 && 0<day_validation && day_validation < 32){
        correctValueDate = true;
      }
    return correctValueDate;
  }

  private static int setDates(){
  	Calendar now = Calendar.getInstance();
	Calendar nac = Calendar.getInstance();
    nac.set(Calendar.YEAR, Integer.parseInt(parts[2]));
    nac.set(Calendar.MONTH, Integer.parseInt(parts[0]));
    nac.set(Calendar.DAY_OF_MONTH, Integer.parseInt(parts[1]));
	//nac.setTime(...);
	if (nac.after(now)) {
	  System.out.println("Esa fecha aun no llega");
	  return 0;
	}
	int year1 = now.get(Calendar.YEAR);
	int year2 = nac.get(Calendar.YEAR);
	int age = year1 - year2;
	int month1 = now.get(Calendar.MONTH)+1;
	int month2 = nac.get(Calendar.MONTH);
	if (month2 > month1) {
	  age--;
	} else if (month1 == month2) {
	  int day1 = now.get(Calendar.DAY_OF_MONTH);
	  int day2 = nac.get(Calendar.DAY_OF_MONTH);
	  if (day2 > day1) {
	    age--;
	  }
	}
	System.out.println("Edad en anios: "+age);
	if(age < 18){
		System.out.println("Menor de edad");
	}else{
		System.out.println("Mayor de edad");
	}
	return 1;
  }
}