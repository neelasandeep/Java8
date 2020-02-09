package bonnus_tasks.task5;

import java.util.Collections;

import java.util.List;

import org.testng.internal.collections.Ints;

public class ReverseNumbers {
	public  List<Integer> printNumbersusingCustomComparator(int[] arrayNumbers) {
		List<Integer> listOfArrayNumbers = Ints.asList(arrayNumbers);
		Collections.sort(listOfArrayNumbers, (number1, number2) -> {
			if (number1 < number2) {
				return +1;
			} else if (number1 > number2) {
				return -1;
			} else {
				return 0;
			}
		});
		return listOfArrayNumbers;
	}
	
}
