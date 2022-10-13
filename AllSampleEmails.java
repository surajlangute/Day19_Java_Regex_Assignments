package day19.Assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllSampleEmails {

	public static boolean isValidEmail(String email) {

		String eMailRegex = ("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
		boolean isMatched = Pattern.compile(eMailRegex).matcher(email).matches();
		if (isMatched)
			return true;
		else
			return false;
	}

	public static void main(String args[]) {

		String str1 = "abc@yahoo.com";
		System.out.println(isValidEmail(str1));

		String str2 = "abc-100@yahoo.com";
		System.out.println(isValidEmail(str2));

		String str3 = "abc.100@yahoo.com";
		System.out.println(isValidEmail(str3));

		String str4 = "abc111@abc.com";
		System.out.println(isValidEmail(str4));

		String str5 = "abc-100@abc.net";
		System.out.println(isValidEmail(str5));

		String str6 = "abc.100@abc.com.au";
		System.out.println(isValidEmail(str6));

		String str7 = "abc@1.com";
		System.out.println(isValidEmail(str7));

		String str8 = "abc@gmail.com.com";
		System.out.println(isValidEmail(str8));

		String str9 = "abc+100@gmail.com";
		System.out.println(isValidEmail(str9));

		String str10 = "abc";
		System.out.println(isValidEmail(str10));

		String str11 = "abc@.com.my";
		System.out.println(isValidEmail(str11));

		String str12 = "abc123@gmail.a";
		System.out.println(isValidEmail(str12));

		String str13 = "abc123@.com";
		System.out.println(isValidEmail(str13));

		String str14 = "abc123@.com.com";
		System.out.println(isValidEmail(str14));

		String str15 = ".abc@abc.com";
		System.out.println(isValidEmail(str15));

		String str16 = ".abc()*@gmail.com";
		System.out.println(isValidEmail(str16));

		String str17 = "abc@%*.com";
		System.out.println(isValidEmail(str17));

		String str18 = "abc..202@gmail.com";
		System.out.println(isValidEmail(str18));

		String str19 = "abc.@gmail.com";
		System.out.println(isValidEmail(str19));

		String str20 = "abc@abc@gmail.com";
		System.out.println(isValidEmail(str20));

		String str21 = "abc@gmail.com.1a";
		System.out.println(isValidEmail(str21));

		String str22 = "agfv@hhhj@hjjh.lkj";
		System.out.println(isValidEmail(str22));
	}
}
