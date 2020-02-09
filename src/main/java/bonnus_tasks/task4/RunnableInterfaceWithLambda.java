package bonnus_tasks.task4;

import org.apache.log4j.Logger;

import util.BaseClass;

public class RunnableInterfaceWithLambda {
	static Logger logger = Logger.getLogger(RunnableInterfaceWithLambda.class);

	public static void main(String[] args) {
		BaseClass.getBaseClassLogger();
		Thread thread = new Thread(() -> {

			for (int itearation = 0; itearation < 10; itearation++) {
				logger.info(itearation + "from child thread");
			}

		});
		thread.start();
	}

}
