package bonnus_tasks.rotationsofstrings;

public class StringRotationWithoutLambda implements StringsRotation{
	public boolean findRotationOfStrings(String firstString,String secondString) {
		boolean isRotation=true;
		if(firstString.length()!= secondString.length() ||(firstString==null || secondString==null)) {
			isRotation=false;
		}else {
			firstString=firstString.concat(firstString);
			isRotation =firstString.toLowerCase().contains(secondString.toLowerCase());
		}
		return isRotation;
	}


}
