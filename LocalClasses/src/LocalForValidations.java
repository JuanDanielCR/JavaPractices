
public class LocalForValidations {
	public static void main(String args[]){
		validateNumber("123-456-7890", "456-7890");
	}
	
	static String regexp = "[^0-9]";//Any character not in brackets
	
	//static method
	private static void validateNumber(String number1, String number2){
		//local class access only to final local variables (variables inside the block where it is defined)
		final int length = 10;
		//Declaration of the local class
		class PhoneNumber{
			String formatNumber =  null;
			PhoneNumber(String phoneNumber){
				String currentNumber = phoneNumber.replaceAll(regexp, ""); 
				//Can access to regexp variable inside a local class inside an static block because regexp is also static
				System.out.println(currentNumber);
				if (currentNumber.length() == length)
                    formatNumber = currentNumber;
                else
                    formatNumber = null;
			}
			public String getNumber() {
				return formatNumber;
			}
		}//end of class
		
		//Instantiating local class two times!
		PhoneNumber myNumber1 = new PhoneNumber(number1);
        PhoneNumber myNumber2 = new PhoneNumber(number2);
        
        if (myNumber1.getNumber() == null) 
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + myNumber2.getNumber());
	}
}
