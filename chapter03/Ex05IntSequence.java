package chapter03;

public interface Ex05IntSequence {

	default boolean hasNext() { return true; };
	int next();

	
	//Since hasNext() is default - the static method returns an implementation of the next() method
	static Ex05IntSequence constant (int numSequence) {

		return () -> { return numSequence; };
	}
}
