package bonnus_tasks.task9;


import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import util.BaseClass;

public class DescendingSortTask {
	static Logger logger = Logger.getLogger(DescendingSortTask.class);

	public static void main(String[] args) {
		BaseClass.getBaseClassLogger();
		Map<String, Integer> employeeRecord = new DescendingSortMap().sortReverse();

		employeeRecord.put("Sandeep", 555);
		employeeRecord.put("Ramesh", 545);
		employeeRecord.put("Rakesh", 955);
		employeeRecord.put("Suresh", 560);
		employeeRecord.put("Raju", 9888);
		logger.info("sorting employee Record with Lambda Representation \n"+employeeRecord);
		Map<String, Integer> employeeRecord2 = new TreeMap<>(new DescendingorderWithoutLambda());

		employeeRecord2.put("Sandeep", 555);
		employeeRecord2.put("Ramesh", 545);
		employeeRecord2.put("Rakesh", 955);
		employeeRecord2.put("Suresh", 560);
		employeeRecord2.put("Raju", 9888);
		logger.info("sorting employee Record without Lambda Representation \n"+employeeRecord2);
		

	}

}
