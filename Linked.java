import java.util.*;
	public class Linked {
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<>();
	ll.add("Hi");
		ll.add("Shankhdeep");
		ll.add(1, "I am");
	System.out.println(
			"Initial LinkedList " + ll);
	ll.remove(1);
	System.out.println(
			"After the Index Removal " + ll);
	ll.remove("Hi");
	
		System.out.println(
			"After the Object Removal " + ll);
	}
}
