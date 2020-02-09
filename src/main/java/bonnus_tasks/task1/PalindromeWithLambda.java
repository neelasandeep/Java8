package bonnus_tasks.task1;

import java.util.Scanner;

import org.apache.log4j.Logger;

import util.BaseClass;

public class PalindromeWithLambda {
	static Scanner scanner = new Scanner(System.in);
	 static Logger logger = Logger.getLogger(PalindromeWithLambda.class);
	public static void main(String[] args) {
		BaseClass.getBaseClassLogger();
		
		logger.info("enter a String to check whether palindrome or not");
		String inputString=scanner.next();
		 if (checkPalindrome(inputString))
			 logger.info(inputString + " is a palindrome");
		else
			 logger.info(inputString + " is not a palindrome");
		
		
		
	}
	
	public static boolean checkPalindrome(String stringToCheck) {
		
		
		
		Palindrome palindrome = referencestring -> {
											for (int i = 0, j = referencestring.length() - 1; i < referencestring.length() / 2; i++, j--) {
												if (referencestring.charAt(i) != referencestring.charAt(j)) {
													return false;
												}
											}
											return true;
										};
				return palindrome.checkPalindome(stringToCheck);
		
		
	}

}


