package hometask2;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import util.BaseClass;



public class FruitsSelection {
	static Logger logger = Logger.getLogger(FruitsSelection.class);
	public static void main(String[] args) {
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
		
		List<Fruits> requiredFruitsList=new FindRequiredFruits()
									.findRequiredList(fruitsList);
		logger.info(requiredFruitsList);
		

	}

}
