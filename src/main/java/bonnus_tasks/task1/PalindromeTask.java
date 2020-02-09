package bonnus_tasks.task1;

import java.util.Scanner;

import org.apache.log4j.Logger;

import util.BaseClass;

public class PalindromeTask {
	static Scanner scanner = new Scanner(System.in);
	 static Logger logger = Logger.getLogger(PalindromeTask.class);
	public static void main(String[] args) {
		BaseClass.getBaseClassLogger();
		 logger.info("enter a String to check whether palindrome or not");
		String inputString = scanner.nextLine();
		if (checkPalindrome(inputString))
			 logger.info(inputString + " is a palindrome");
		else
			 logger.info(inputString + " is not a palindrome");

	}

	public static boolean checkPalindrome(String stringPassed) {
		boolean ispalindrome = true;
		for (int i = 0, j = stringPassed.length() - 1; i < stringPassed.length() / 2; i++, j--) {
			if (stringPassed.charAt(i) != stringPassed.charAt(j)) {
				ispalindrome = false;
			}
		}
		return ispalindrome;
	}
	

}

