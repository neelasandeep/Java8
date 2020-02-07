package javatestautomation.hometask1_1;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LargestNumberUsingLambdaTest {
	SoftAssert softAssert= new SoftAssert();
	@Test
	public void largestNumber() {
		softAssert.assertEquals(LargestNumberUsingLambda.findLargestNumberInArray(new double[]{ 1,2,3,4,5,6,7,8,9,10 }),10.0);
		softAssert.assertEquals(LargestNumberUsingLambda.findLargestNumberInArray(new double[]{ 0,0,0,0,0,0,0,0,0,0 }),0.0);
		softAssert.assertEquals(LargestNumberUsingLambda.findLargestNumberInArray(new double[]{ -1,-2,-3,-4,-5,-6,-7,-8,-9,-10 }),-1.0);
		softAssert.assertEquals(LargestNumberUsingLambda.findLargestNumberInArray(new double[]{ 10.5,2.6,3,4,5.7,6,7,8.5,9.9,10.8 }),10.8);
		softAssert.assertEquals(LargestNumberUsingLambda.findLargestNumberInArray(new double[]{ 1,2,3,4,888,6,7,8,9,10 }),888.0);
		softAssert.assertAll();
	}

}
