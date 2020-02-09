package bonnus_tasks.task5;

import java.util.Comparator;

public class ReverseNumberWithoutLambda implements Comparator<Integer>{
	
		

	@Override
	public int compare(Integer object1, Integer object2) {
		if (object1 < object2) {
			return +1;
		} else if (object1 > object2) {
			return -1;
		} else {
			return 0;
		}
	}

}
