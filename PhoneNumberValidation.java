package day19.Assignments;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumberValidation {

	static boolean validate(String pattern, String input) {
		return Pattern.compile(pattern).matcher(input).matches();
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String mobileRegex = "^[91]{2}?[0-9]{10}$";
		
		System.out.println("Enter Mobile Number with Country Code : ");
		String mobileNum = scan.next();

		if (validate(mobileRegex, mobileNum))
			System.out.println("Valid Mobile Number");
		else
			System.out.println("In-valid Mobile Number");
	}
}
