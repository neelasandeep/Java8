package bonnus_tasks.task7;

import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;

import util.BaseClass;

public class ReverseSort {
	static Logger logger = Logger.getLogger(ReverseSort.class);

	public static void main(String[] args) {
		BaseClass.getBaseClassLogger();
		Set<Integer> setOfNumbers = new ReverseSortNumber().sortReverse();

		setOfNumbers.add(1);
		setOfNumbers.add(-10);
		setOfNumbers.add(22);
		setOfNumbers.add(33);
		setOfNumbers.add(0);
		logger.info("Reversing withlambda representation\n"+setOfNumbers);
		Set<Integer> setOfNumbers2 = new TreeSet<>(new MyComparator());

		setOfNumbers2.add(1);
		setOfNumbers2.add(-10);
		setOfNumbers2.add(22);
		setOfNumbers2.add(33);
		setOfNumbers2.add(0);
		logger.info("Reversing without lambda representation\n"+setOfNumbers2);

	}

}
