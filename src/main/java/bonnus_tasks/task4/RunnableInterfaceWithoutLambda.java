package bonnus_tasks.task4;

import org.apache.log4j.Logger;

import util.BaseClass;

public class RunnableInterfaceWithoutLambda {
	static Logger logger = Logger.getLogger(RunnableInterfaceWithoutLambda.class);

	public static void main(String[] args) {
		BaseClass.getBaseClassLogger();
		MyRunnableClass myrunnableClass = new MyRunnableClass();

		Thread thread = new Thread(myrunnableClass);
		thread.start();
	}

}
