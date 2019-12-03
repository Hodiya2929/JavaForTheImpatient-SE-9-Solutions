package chapter05;

import java.util.concurrent.locks.ReentrantLock;

public class Ex09ReentrantLock {
	
	@SuppressWarnings("serial")
	public static class MyReentrantLock extends ReentrantLock implements AutoCloseable{

		@Override
		public void close(){		
			unlock();
		}	
	}
	
	public static AutoCloseable lock() {
		
		var locker = new MyReentrantLock(); 
		
		locker.lock();
			
		return locker;	//implements AutoCloseable			
	}
	
	
	/*
	 *		public static AutoCloseable tryLock(ReentrantLock locker) {
	 * 		locker.lock();
	 * 		return ()->{ locker.unlock(); };
	 * 		}
	 */
   		
	//Demo 
	public static void main(String[] args){
		
		//try(ReentrantLock lock = new ReentrantLock()){} = compiler error
		
		try(var locker = lock();){	
			
			//some work...	
		
		} catch (Exception e) {	
			/*must catch the exception since the static method 'lock' 
			return an 'AutoCloseable' and not 'MyReentrantLock' object
			(AutoClosable is more general case and MyReentrantLock is
			 private case)
			*/	
			e.printStackTrace();
		} 
		
	}
}
