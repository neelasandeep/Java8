package javatestautomation.hometask1;

import java.util.Scanner;

import org.apache.log4j.Logger;

import util.BaseClass;

public class HomeTask1 {
	static Scanner scanner = new Scanner(System.in);
	 static Logger logger = Logger.getLogger(HomeTask1.class);
	public static void main(String[] args) {
		BaseClass.getBaseClassLogger();
		 logger.info("enter a String to check whether palindrome or not");
		String inputString = scanner.nextLine();
		if (checkPalindrome(inputString))
			 logger.info(inputString + " is a palindrome");
		else
			 logger.info(inputString + " is not a palindrome");

	}

	public static boolean checkPalindrome(String StringPassed) {
		boolean ispalindrome = true;
		for (int i = 0, j = StringPassed.length() - 1; i < StringPassed.length() / 2; i++, j--) {
			if (StringPassed.charAt(i) != StringPassed.charAt(j)) {
				ispalindrome = false;
			}
		}
		return ispalindrome;
	}
	

}

