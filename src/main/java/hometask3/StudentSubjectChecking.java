package hometask3;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import hometask2.FruitsSelection;
import util.BaseClass;

public class StudentSubjectChecking {
	static Logger logger = Logger.getLogger(FruitsSelection.class);
	public static void main(String[] args) {
		
		BaseClass.getBaseClassLogger();
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
		
		BiFunctionTests subjectcheck=new BiFunctionTests();
	
		logger.info(student1.getEmployeeName()+" is optedhis subject or not " +subjectcheck.checkStudentSubject(student1, subjectList));
		logger.info(student2.getEmployeeName()+" is optedhis subject or not " +subjectcheck.checkStudentSubject(student2, subjectList));
		
		

	}
}
