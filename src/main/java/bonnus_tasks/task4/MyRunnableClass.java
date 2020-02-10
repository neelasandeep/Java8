package bonnus_tasks.task4;

import org.apache.log4j.Logger;

import util.BaseClass;

public class MyRunnableClass implements Runnable {
	static Logger logger = Logger.getLogger(MyRunnableClass.class);
	
   
    public void run() {
    	BaseClass.getBaseClassLogger();
    	for (int itearation = 0; itearation < 10; itearation++) {
			logger.info(itearation + " from child thread");
		}
    } 
}
