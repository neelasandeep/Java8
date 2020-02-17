package hometask3test;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import hometask3.BiFunctionTests;
import hometask3.Student;
import hometask3.Subjects;

public class StudentSubjectCheckingTest {
	
	SoftAssert Assert= new SoftAssert();
		
		@Test
		public void test() {
			
			List<String> subjects=new ArrayList<>();
			subjects.add("Science");
			subjects.add("computers");
			subjects.add("Data");
			subjects.add("Maths");
			subjects.add("Biology");
			Subjects subjectList=new Subjects();
			subjectList.setSubjectList(subjects);
			Student student1=new Student("Ram", "Biology");
			Student student2=new Student("rahim", "MicroBiology");
			Student student3=new Student("Ram", "Maths");
			Student student4=new Student("sahel", "Anatomy");
			Student student5=new Student("kiran", "Science");
			Student student6=new Student("praveen", "Data");
			
			BiFunctionTests subjectcheck=new BiFunctionTests();
			Assert.assertEquals(subjectcheck.checkStudentSubject(student1, subjectList), "Yes");
			Assert.assertEquals(subjectcheck.checkStudentSubject(student2, subjectList), "No");
			Assert.assertEquals(subjectcheck.checkStudentSubject(student3, subjectList), "Yes");
			Assert.assertEquals(subjectcheck.checkStudentSubject(student4, subjectList), "No");
			Assert.assertEquals(subjectcheck.checkStudentSubject(student5, subjectList), "Yes");
			Assert.assertEquals(subjectcheck.checkStudentSubject(student6, subjectList), "Yes");
		    Assert.assertAll();
			
			
		}

}
