package day19.Assignments;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstNameValidation {
	
	private static boolean validate(String firstNameRegex, String firstName) {
		return Pattern.compile(firstNameRegex).matcher(firstName).matches();
	}
		Scanner scan =new Scanner(System.in);
		
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		String firstNameRegex = "^[A-Z]{1}[a-zA-Z]{2,}";
		
		System.out.println("Enter your First Name : ");    //eg : Suraj 
		String firstName = scan.next();
		
		boolean first = validate(firstNameRegex, firstName);
		if (first == true)
			System.out.println("Valid First Name");
		else
			System.out.println("In-valid First Name");

	}

	

}
