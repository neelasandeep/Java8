package bonnus_tasks.task7;

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

}
