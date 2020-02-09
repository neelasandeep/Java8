package bonnus_tasks.task3;

import java.util.Scanner;

import org.apache.log4j.Logger;

import util.BaseClass;

public class RotationsOfStrings {
	static Scanner scanner = new Scanner(System.in);
	static Logger logger = Logger.getLogger(RotationsOfStrings.class);
	public static void main(String[] args) {
		BaseClass.getBaseClassLogger();
		logger.info("finding rotations without lambda");
		logger.info("enter String one");
		String firstString=scanner.next();
		logger.info("enter String two");
		String secondString=scanner.next();
		StringRotationWithoutLambda string=new StringRotationWithoutLambda();
		if(string.findRotationOfStrings(firstString, secondString)){
			logger.info("both are rotations of each other");
		}else {
			logger.info("both are not rotations of each other");
		}
		
		
		logger.info("finding rotations with LambdaExpressions");
		boolean isRotation = findRotationusinglambda(firstString, secondString);
		if(isRotation) {
			logger.info("both are rotations of each other");
		}else {
			logger.info("both are not rotations of each other");
		}
		
	}
	
	public static boolean findRotationusinglambda(String firstString, String secondString) {
		StringsRotation rotation=(firstStringTocheck,secondStringTocheck)->{
			boolean isRotation=true;
			if(firstStringTocheck.length()!= secondStringTocheck.length() ||(firstStringTocheck==null || secondStringTocheck==null)) {
				isRotation=false;
			}else {
				firstStringTocheck=firstStringTocheck.concat(firstStringTocheck);
				isRotation =firstStringTocheck.toLowerCase().contains(secondStringTocheck.toLowerCase());
			}
			return isRotation;
		};
		return rotation.findRotationOfStrings(firstString,secondString);
	}
	
	
}





