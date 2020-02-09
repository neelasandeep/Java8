package bonustasksTestcases.task3testcase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bonnus_tasks.task3.RotationsOfStrings;
import bonnus_tasks.task3.StringRotationWithoutLambda;

public class RotationOfstringTest {
	SoftAssert softAssert= new SoftAssert();
	
	@Test
	public void testRotationOfStrings() {
		softAssert.assertTrue(RotationsOfStrings.findRotationusinglambda("abcd","dabc"));
		softAssert.assertTrue(RotationsOfStrings.findRotationusinglambda("sandeep","deepsan"));
		softAssert.assertFalse(RotationsOfStrings.findRotationusinglambda("facebook","booksca"));
		softAssert.assertFalse(RotationsOfStrings.findRotationusinglambda("ram","srm"));
		softAssert.assertAll();
	}
	@Test
	public void testRotationOfStringsusinglambda() {
		StringRotationWithoutLambda string=new StringRotationWithoutLambda();
		softAssert.assertTrue(string.findRotationOfStrings("abcd", "dabc"));
		softAssert.assertTrue(string.findRotationOfStrings("sandeep","deepsan"));
		softAssert.assertFalse(string.findRotationOfStrings("facebook","booksca"));
		softAssert.assertFalse(string.findRotationOfStrings("ram","srm"));
		softAssert.assertAll();
	}

}
