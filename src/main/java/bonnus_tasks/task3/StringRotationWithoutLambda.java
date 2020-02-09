package bonnus_tasks.task3;

public class StringRotationWithoutLambda implements StringsRotation{
	public boolean findRotationOfStrings(String firstString,String secondString) {
		boolean isRotation=true;
		if(firstString.length()!= secondString.length() ) {
			isRotation=false;
		}else {
			firstString=firstString.concat(firstString);
			isRotation =firstString.toLowerCase().contains(secondString.toLowerCase());
		}
		return isRotation;
	}


}
