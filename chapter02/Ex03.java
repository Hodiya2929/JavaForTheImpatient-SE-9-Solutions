package chapter02;

public class Ex03 {

	static class MutatorReturnsNotVoid{

		int num;

		public MutatorReturnsNotVoid() {

			num = 0;
		}

		// Dummy function which changes the object = Mutator and return an integer.
		int mutator() {
			this.num = 34;
			return 56;
		}

	}

	static class AccessorReturnsVoid{

		int num;

		public AccessorReturnsVoid() {

			this.num = 0;
		}

		//Dummy accessor method which returns void
		void accessorReturnsVoid() {

		}



	}

	public static void main(String[] args) {


		var mutator= new MutatorReturnsNotVoid();
		var number=mutator.mutator();
		var accessor = new AccessorReturnsVoid();
		accessor.accessorReturnsVoid();

	}

}
