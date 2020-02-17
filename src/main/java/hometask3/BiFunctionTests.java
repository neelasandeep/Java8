package hometask3;


import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionTests {
	BiFunction<Student,Subjects,String> isOpted=(student,subjects)->{
		String isstudentOptedSubjectFromList="No";
		List<String> subjectsList=subjects.getSubjectList();
		if(subjectsList.contains(student.getSubject())) {
			isstudentOptedSubjectFromList="Yes";
		}else {
			isstudentOptedSubjectFromList="No";
		}
		
		
		return isstudentOptedSubjectFromList;
		
	};
	
	public  String checkStudentSubject(Student student,Subjects subject) {
		
		return isOpted.apply(student,subject);
		
	}
	

}
