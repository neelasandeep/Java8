package bonnus_tasks.task2;

import java.util.Arrays;

import org.apache.log4j.Logger;

import util.BaseClass;

public class SecondBiggestNumber {

	static Logger logger = Logger.getLogger(SecondBiggestNumber.class);

	public static void main(String[] args) {

		BaseClass.getBaseClassLogger();

		int[] array = { -3, 298, 25, 643, -96, 0 };
		int size = array.length;
		logger.info("without Lambda largest number");
		
		logger.info("2nd largest element is ::" + secondLargestNumberwithoutLambdaExpression(array, size));

		logger.info("with Lambda largest number");
		logger.info("2nd largest element is ::" + secondLargestNumberwithLambdaExpression(array, size));

	}

	public static int secondLargestNumberwithLambdaExpression(int[] array, int size) {
		SecondLargestNumber secondLarge = (arrayTocheck, sizeOfThepassedArray) -> {
			Arrays.sort(arrayTocheck);
		
			return arrayTocheck[sizeOfThepassedArray - 2];

		};
		return secondLarge.findSecondLargest(array, size);
	}

	public static int secondLargestNumberwithoutLambdaExpression(int[] array, int size) {
		Arrays.sort(array);
	

		return array[size - 2];

	}

}


