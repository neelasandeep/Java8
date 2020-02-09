package bonnus_tasks.task5;


import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.internal.collections.Ints;

import util.BaseClass;

public class ComparatorInterfaceNum {
	static Logger logger = Logger.getLogger(ComparatorInterfaceNum.class);

	public static void main(String[] args) {
		BaseClass.getBaseClassLogger();
		int[] arrayNumbers = { 12, -1, 0, 3, 67, 98, 45, -90 };
		List<Integer> listOfArrayNumbers = new ReverseNumbers().printNumbersusingCustomComparator(arrayNumbers);
		logger.info("Array elements after sorting it into reverse order\n" + listOfArrayNumbers);
		List<Integer> listOfArrayNumbers2=Ints.asList(arrayNumbers);
		Collections.sort(listOfArrayNumbers2,new ReverseNumberWithoutLambda());
		logger.info("Array elements after sorting it into reverse order Without lambda\n"+ listOfArrayNumbers2);
	}

	
}
