import java.util.*;
	
public class Linke {
	
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<>();
	
		ll.add("Hi");
		ll.add("Shankhdeep");
		ll.add(1, "You are");
	
		System.out.println("Initial LinkedList " + ll);
	
		ll.set(1, "I am");
	
		System.out.println("Updated LinkedList " + ll);
	}
}
