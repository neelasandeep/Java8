package bonnus_tasks.task9;

import java.util.Map;
import java.util.TreeMap;

public class DescendingSortMap {
	public Map<String, Integer> sortReverse() {
		return new TreeMap<>((record1, record2) -> {
			if (record1.compareTo(record2) < 0) {
				return +1;
			} else if (record1.compareTo(record2) > 0) {
				return -1;
			} else {
				return 0;
			}
		});

	}

}
