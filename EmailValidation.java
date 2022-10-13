package day19.Assignments;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String emailRegex = "[a-zA-Z]+([_+-.][a-zA-Z])*[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2})*$";
		
		System.out.println("Enter your Email Id : "); //eg :Surajlangute@gmail.com
		String email = scan.next();
		
		boolean isMatched = Pattern.compile(emailRegex).matcher(email).matches();
		if (isMatched)
			System.out.println("Valid Email Id ");
		else
			System.out.println("In-valid Email Id ");

	}
}
