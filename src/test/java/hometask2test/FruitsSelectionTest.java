package hometask2test;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import hometask2.FindRequiredFruits;
import hometask2.Fruits;
import util.BaseClass;

public class FruitsSelectionTest {
	static Logger logger = Logger.getLogger(FruitsSelectionTest.class);
SoftAssert Assert= new SoftAssert();
	
	@Test
	public void test() {
		BaseClass.getBaseClassLogger();
		List<Fruits> fruitsList=new ArrayList<>();
		Fruits fruit1= new Fruits("Apple",50);
		Fruits fruit2= new Fruits("Banana",45);
		Fruits fruit3= new Fruits("Orange",40);
		Fruits fruit4= new Fruits("Green Apple",70);
		fruitsList.add(fruit1);
		fruitsList.add(fruit2);
		fruitsList.add(fruit3);
		fruitsList.add(fruit4);
		
		
		Assert.assertEquals(new FindRequiredFruits()
				.findRequiredList(fruitsList).size(),1);	
		Assert.assertAll();

}
	@Test
	public void test2() {
		BaseClass.getBaseClassLogger();
		List<Fruits> fruitsList=new ArrayList<>();
		Fruits fruit1= new Fruits("Apple",50);
		Fruits fruit2= new Fruits("anjur",45);
		Fruits fruit3= new Fruits("Orange",40);
		Fruits fruit4= new Fruits("Green Apple",70);
		fruitsList.add(fruit1);
		fruitsList.add(fruit2);
		fruitsList.add(fruit3);
		fruitsList.add(fruit4);
		
		
		Assert.assertEquals(new FindRequiredFruits()
				.findRequiredList(fruitsList).size(),0);	
		Assert.assertAll();

}
	@Test
	public void test3() {
		BaseClass.getBaseClassLogger();
		List<Fruits> fruitsList=new ArrayList<>();
		Fruits fruit1= new Fruits("Badham",50);
		Fruits fruit2= new Fruits("Banana",45);
		Fruits fruit3= new Fruits("Badar",40);
		Fruits fruit4= new Fruits("Band",70);
		fruitsList.add(fruit1);
		fruitsList.add(fruit2);
		fruitsList.add(fruit3);
		fruitsList.add(fruit4);
		
		
		Assert.assertEquals(new FindRequiredFruits()
				.findRequiredList(fruitsList).size(),4);	
		Assert.assertAll();

}
}
