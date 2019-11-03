package chapter02;

public class Ex14 {

	public static void main(String[] args) {
	
	/*
	 * run javac ch02/sec06/Network.java
	 * 
	 * run javap -private ch02.sec06.Network$Member 
	 * 
	 * The outcome is:
  public class ch02.sec06.Network$Member {
  private java.lang.String name;
  private java.util.ArrayList<ch02.sec06.Network$Member> friends;
  final ch02.sec06.Network this$0;
  public ch02.sec06.Network$Member(ch02.sec06.Network, java.lang.String);
  public void deactivate();
  public void addFriend(ch02.sec06.Network$Member);
  public boolean belongsTo(ch02.sec06.Network);
  public java.lang.String toString();
  }
  
   final ch02.sec06.Network this$0 is the reference to the enclosing class
	
		 */

	}

}
