package javatestautomation.hometask1_1;

import org.apache.log4j.Logger;


import util.BaseClass;

public class LargestNumberUsingLambda  {
	static Logger logger = Logger.getLogger(LargestNumberUsingLambda.class);
	public static void main(String[] args) {
		BaseClass.getBaseClassLogger();
		double[] numArray = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 };
	
		logger.info(findLargestNumberInArray(numArray)+" is the largest number in the array ");

	}
	
	public static double findLargestNumberInArray(double[] numArray) {
		LargestNumber largestNumberInArray = numberArray -> {
									double largestNumber = numberArray[0];
									for (double number : numberArray) 
									{
										if (largestNumber < number)
											largestNumber = number;
									}
									return largestNumber;
								};
		
			return largestNumberInArray.larger(numArray);
	}
}


