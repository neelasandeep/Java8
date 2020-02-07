package bonustasksTestcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bonnus_tasks.SecondBiggestNumber;



public class SecondBiggestNumberTest {
	SoftAssert softAssert= new SoftAssert();
	
	
	@Test
	public void largestNumber() {
		
		softAssert.assertEquals(SecondBiggestNumber.secondLargestNumberwithLambdaExpression(new int[]{ 1,2,3,4,5,6,7,8,9,10 },10),9);
		softAssert.assertEquals(SecondBiggestNumber.secondLargestNumberwithLambdaExpression(new int[]{ 0,0,0,0,0,0,0,0,0,0 },10),0);
		softAssert.assertEquals(SecondBiggestNumber.secondLargestNumberwithLambdaExpression(new int[]{ -1,-2,-3,-4,-5,-6,-7,-8,-9,-10 },10),-2);
		softAssert.assertEquals(SecondBiggestNumber.secondLargestNumberwithLambdaExpression(new int[]{ 10,6,3,4,7,6,7,85,99,108 },10),99);
		softAssert.assertEquals(SecondBiggestNumber.secondLargestNumberwithLambdaExpression(new int[]{ 1,2,3,4,888,6,7,8,9,10 },10),10);
		softAssert.assertAll();
	}


}
