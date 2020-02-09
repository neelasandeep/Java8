package bonnus_tasks.task9;

import java.util.Comparator;

public class DescendingorderWithoutLambda implements Comparator<String>{

	@Override
	public int compare(String record1, String record2) {
		if (record1.compareTo(record2) < 0) {
			return +1;
		} else if (record1.compareTo(record2) > 0) {
			return -1;
		} else {
			return 0;
		}
	}

}
