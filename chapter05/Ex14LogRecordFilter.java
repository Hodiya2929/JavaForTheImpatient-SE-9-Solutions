package chapter05;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class Ex14LogRecordFilter {

	public static void main(String[] args) throws SecurityException, IOException {

		var myProjLog = new ProjectLogger("chapter05.excercise14");
		myProjLog.setMyLogger();
		myProjLog.logIntoAFile("Log");
		myProjLog.filter();

		myProjLog.myLogger.info("this logger doesn't log anything");
		myProjLog.myLogger.info("It logs bad words like: c++, sex or drugs");
	}

	public static class ProjectLogger { 

		public Logger myLogger;

		public ProjectLogger(String loggerName) {
			myLogger = Logger.getLogger(loggerName);
		}

		public void setMyLogger() {
			myLogger.setLevel(Level.FINE);
			myLogger.setUseParentHandlers(false);
		}

		public void logIntoAFile(String fileName) throws SecurityException, IOException {
			var fh = new FileHandler("src/chapter05/Ex14Log.log", 5000, 1, true);
			fh.setFormatter(new SimpleFormatter());
			myLogger.addHandler(fh);
			
		}

		public void filter() {
			myLogger.setFilter(log->
			{
				var message = log.getMessage().toLowerCase();

				if(message.contains(" drugs")||
						message.contains(" sex")||
						message.contains(" c++"))
					return true;

				return false;
			});
		}

	}

}
