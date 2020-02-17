package hometask2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FindRequiredFruits {
	 Predicate<Fruits> isNameStartWithA=p-> {
		return p.name.startsWith("B");
	};

	 Predicate<Fruits> priceGreaterThan30 =p-> {
		return p.price > 30;
	};
	  public List<Fruits> findRequiredList(List<Fruits> fruitsList){
		 return findRequiredFruitsList(isNameStartWithA.and(priceGreaterThan30),fruitsList);
}
	public List<Fruits> findRequiredFruitsList(Predicate<Fruits> predicate, List<Fruits> fruitsList) {
		List<Fruits> requiredList = new ArrayList<>();
		for (Fruits fruit : fruitsList) {
			if (predicate.test(fruit)) {
				requiredList.add(fruit);
			}
		}
		return requiredList;
	}

}
