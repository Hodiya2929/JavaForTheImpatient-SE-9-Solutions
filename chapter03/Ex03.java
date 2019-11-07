package chapter03;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import javax.imageio.stream.ImageOutputStream;
import javax.imageio.stream.ImageOutputStreamImpl;

public class Ex03 {
	
	
	/* Data is based on https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/String.html
	 * 
	 * A supertype variable can be assign to a subtype variable without any conversion.
	 * 
	 * String supertypes are: Serializable, Comparable<String>, CharSequence, Constable, ConstantDesc
	 * Scanner supertypes are: Iterator<String>, Closeable.
	 * ImageOutputStream supertypes are: AutoCloseable, Closeable, DataInput, DataOutput, ImageInputStream
	 */
	
	
	//Exapmles
	@SuppressWarnings("resource")
	public static void main (String args[]) {
		
		String stringType = "Aba";
		Scanner scannerType = new Scanner(System.in);
		ImageOutputStream imageOutputStreamType = new ImageOutputStreamImpl() {
			
			@Override
			public int read(byte[] b, int off, int len) throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int read() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void write(byte[] b, int off, int len) throws IOException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void write(int b) throws IOException {
				// TODO Auto-generated method stub
				
			}
		};
		
	System.out.println("stringType is instance of CharSequence? " + (stringType instanceof CharSequence));	
	System.out.println("scannerType is instance of Iterator? " + (scannerType instanceof Iterator));
	System.out.println("imageOutputStreamType is instance of Closeable: " + (imageOutputStreamType instanceof java.io.Closeable));
	}
	

}
