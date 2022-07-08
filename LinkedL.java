import java.util.*;
	public class LinkedL {
	public static void main(String args[])
	{
		LinkedList<String> ll
			= new LinkedList<>();
	ll.add("Hi");
		ll.add("Shankhdeep");
		ll.add(1, "I am");
for (int i = 0; i < ll.size(); i++) {
	System.out.print(ll.get(i) + " ");
		}
	System.out.println();
	
		for (String str : ll)
			System.out.print(str + " ");
	}
}
