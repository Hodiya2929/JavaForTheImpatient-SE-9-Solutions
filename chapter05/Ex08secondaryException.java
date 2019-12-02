package chapter05;

public class Ex08secondaryException {

	/*Question number 08 is: How the Scanner class, deals with secondary exceptions inside the 
	 * close method:
	 * 
	 * From the source code of the Scanner class:
	 * 
	 * public void close() {
        if (closed)
            return;
        if (source instanceof Closeable) {
            try {
                ((Closeable)source).close();
            } catch (IOException ioe) {
                lastException = ioe;
            }
        }
        sourceClosed = true;
        source = null;
        closed = true;
    }
	 
	
	 * In the implementation of the close method, the Scanner catch the thrown exception and
	 * save a reference to it.
	 */
}
