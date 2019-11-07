package chapter03;

public class Ex05Demo {

	public static void main(String[] args) {

		var constantSeqquence = Ex05IntSequence.constant(45);

		var i=0;

		while(constantSeqquence.hasNext() && i < 100) {
			System.out.print(i + ":" + constantSeqquence.next()+" ");
			i++;
		}
	}

}
