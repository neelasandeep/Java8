package bonustasksTestcases.task5teskcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.collections.Ints;

import bonnus_tasks.task5.ReverseNumbers;

public class ReverseNumbersTest {
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void testRotationOfStrings() {
		ReverseNumbers revNum = new ReverseNumbers();
		softAssert.assertEquals(revNum.printNumbersusingCustomComparator(new int[] { 1, 2, 3, 4, 5, 6, 7 }),
				Ints.asList(new int[] { 7, 6, 5, 4, 3, 2, 1 }));
		softAssert.assertEquals(revNum.printNumbersusingCustomComparator(new int[] { 1, 2, 3, 4, 5, 6, 7 }),
				Ints.asList(new int[] { 7, 6, 5, 4, 3, 2, 1 }));
		softAssert.assertEquals(revNum.printNumbersusingCustomComparator(new int[] { 1, -22, 63, 44, -15, -86, 789 }),
				Ints.asList(new int[] { 789, 63, 44, 1, -15, -22, -86 }));
		softAssert.assertAll();
	}
}
