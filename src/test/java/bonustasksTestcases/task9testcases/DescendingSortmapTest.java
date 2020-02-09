package bonustasksTestcases.task9testcases;

import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bonnus_tasks.task9.DescendingSortMap;
import bonustasksTestcases.task8testcases.SortEmployeeTreeSetTest;
import util.BaseClass;

public class DescendingSortmapTest {
	SoftAssert softAssert = new SoftAssert();
	Logger logger = Logger.getLogger(SortEmployeeTreeSetTest.class);

	@Test
	public void descendingSortMap() {
		BaseClass.getBaseClassLogger();

		Map<String, Integer> employeeRecord = new DescendingSortMap().sortReverse();

		employeeRecord.put("Sandeep", 555);
		employeeRecord.put("Ramesh", 545);
		employeeRecord.put("Rakesh", 955);
		employeeRecord.put("Suresh", 560);
		employeeRecord.put("Raju", 9888);
		Map<String, Integer> employeeRecord2 = new TreeMap<>();
		employeeRecord2.put("Suresh", 560);
		employeeRecord2.put("Sandeep", 555);
		employeeRecord2.put("Ramesh", 545);
		employeeRecord2.put("Rakesh", 955);
		employeeRecord2.put("Raju", 9888);
		
		employeeRecord.forEach((key, value) -> {
			softAssert.assertTrue(employeeRecord2.containsKey(key));
			softAssert.assertAll();
		});

	}
}
