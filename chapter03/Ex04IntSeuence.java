package chapter03;

public interface Ex04IntSeuence {
	
	boolean hasNext();
	int next();
	
	static Ex04IntSeuence of(int... values) {
		
		return new Ex04IntSeuence() {
			
			int index = 0;
			
			@Override
			public int next() {
				
				return hasNext()? values[index++] : 0 ;
			}
			
			@Override
			public boolean hasNext() {
				
				return index < values.length;
			}
		};
		
	}
	
}
