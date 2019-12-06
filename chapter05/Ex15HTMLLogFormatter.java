package chapter05;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Ex15HTMLLogFormatter {

	public static void main(String[] args) throws SecurityException, IOException {

		var fh = new FileHandler("src/chapter05/myLog.html");
		var htmlFormat = new HTMLFormatter("Dummy logger for my Project!");
		fh.setFormatter(htmlFormat);

		var logger = Logger.getLogger("myLog");
		logger.setLevel(Level.INFO);
		logger.addHandler(fh);

		for (int i = 1; i < 20; i++) 
			logger.warning("This is message number: "+i);

	}
	

	public static class HTMLFormatter  extends Formatter{

		String title;

		public HTMLFormatter(String str) {
			super();
			title = str;
		}

		@Override
		public String format(LogRecord record) {

			String s="<body>"+record.getMessage()+" <br /></body>\n";


			formatMessage(record);
			return s;
		}

		@Override
		public String getHead(Handler h) {

			if(title == null)
				return "<html>\n";
			else 

				return "<html>\n<head>"+title+"<br /></head>\n";
		}

		@Override
		public String getTail(Handler h) {

			return "</html>";
		}

	}
}
