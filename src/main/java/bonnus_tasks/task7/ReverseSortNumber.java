package bonnus_tasks.task7;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ReverseSortNumber {
	public Set<Integer> sortReverse() {
		return new TreeSet<>((number1, number2) -> {
			if (number1 < number2) {
				return +1;
			} else if (number1 > number2) {
				return -1;
			} else {
				return 0;
			}
		});

	}
	public Set<Integer> sortReverseWithoutLambda() {
		return new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer number1, Integer number2) {
				if (number1 < number2) {
					return +1;
				} else if (number1 > number2) {
					return -1;
				} else {
					return 0;
				}
			}
			
		});

	}

}
