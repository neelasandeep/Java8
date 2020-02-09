package bonustasksTestcases.task7testcases;

import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.collections.Ints;

import bonnus_tasks.task7.ReverseSortNumber;

public class ReverseSortTestcases {
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void reverseSortTest() {
		Set<Integer> setOfNumbers = new ReverseSortNumber().sortReverse();

		setOfNumbers.add(1);
		setOfNumbers.add(-10);
		setOfNumbers.add(22);
		setOfNumbers.add(33);
		setOfNumbers.add(0);
		Set<Integer> setOfNumbers2 = new ReverseSortNumber().sortReverse();

		setOfNumbers2.add(1);
		setOfNumbers2.add(-10);
		setOfNumbers2.add(22);
		setOfNumbers2.add(33);
		setOfNumbers2.add(1);

		softAssert.assertEquals(setOfNumbers, new TreeSet<Integer>(Ints.asList(new int[] { 33, 22, 1, 0, -10 })));
		softAssert.assertEquals(setOfNumbers2, new TreeSet<Integer>(Ints.asList(new int[] { 33, 22, 1, -10 })));
		softAssert.assertAll();
	}

}
