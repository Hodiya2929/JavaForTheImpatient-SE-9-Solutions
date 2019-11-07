package chapter03;

import java.math.BigInteger;

public class Ex06SquareSequence implements Ex06Sequence<BigInteger> {

	/*
	 * This is not a generic class, but this is a class which implements a generic interface.
	 * The difference is a little tricky because this class return a bigInteger objects,
	 * and of course there can be many other classes which implements this interface and
	 * return other types. By adding a generic type to this class - we actually let the Ex06SquareSequence
	 *  class have a different type as a field, but this is not what we want.
	 */
	
	private BigInteger square;
	
	public Ex06SquareSequence() {
		square = new BigInteger("0");
	}
	
	@Override
	public boolean hasNext() {
	// A sequence is by definition infinite
		return true;
	}

	@Override
	public BigInteger next() {
		
		//former value
		var result = new BigInteger(square.toString());
		
		//Very important - the add method is not a mutator and thus we must assign square to the new returned object 
		square = square.add(BigInteger.ONE);
				
		return result.multiply(result);
	}

	
	public static void main (String args[]) {
		
		var squareSeq = new Ex06SquareSequence();
		var i = 0;
		
		while(squareSeq.hasNext() && i < 10000) {
			
			i++;
			System.out.println(squareSeq.next());			
		}				
	}
}
