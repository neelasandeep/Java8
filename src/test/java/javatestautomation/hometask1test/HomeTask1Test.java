package javatestautomation.hometask1test;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javatestautomation.hometask1.HomeTask1;

public class HomeTask1Test {
	SoftAssert Assert= new SoftAssert();
	
	@Test
	public void checkPalindromee() {
		Assert.assertTrue( HomeTask1.checkPalindrome("dad"));
		Assert.assertTrue( HomeTask1.checkPalindrome("tikkit"));
		Assert.assertFalse( HomeTask1.checkPalindrome("hello"));
		Assert.assertFalse( HomeTask1.checkPalindrome("sandeep"));
		Assert.assertFalse( HomeTask1.checkPalindrome("ram"));
		Assert.assertAll();
	}

}
