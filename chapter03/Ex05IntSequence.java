package chapter03;

public interface Ex05IntSequence {

	default boolean hasNext() { return true; };
	int next();

	static Ex05IntSequence constant (int numSequence) {

		return () -> { return numSequence; };
	}
}
