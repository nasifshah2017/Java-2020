import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
//		ArrayList myList = new ArrayList();
//		myList.add("hello");
//		myList.add(100);
//		myList.add(false);
		
//		String myVal = myList.get(0);
//      This gives error telling us what we stored in the
//      zeroth index of the myList array isn't an string as
//      as it counts that entry as an object. 
		
//      Now if we manually type cast it then Java understands
//      that its not an object rather an String,
		
//		String myVal = (String) myList.get(0);

//       Now if we type-cast a different item to a type that its
//       not then also Java does not show us an error
		
//		String myVal2 = (String) myList.get(1);

//      Now this is a problem because the item we stored in index-1
//      isn't a string rather its an integer but when we wrongly
//      type-cast eclipse doesn't throw an error 
		
//       To get rid of this problem we need to apply Generics
//       We need to declare a certain data-type while we are 
//       declaring a new ArrayList. We need to use angle-brackets
//       to to define our data-type
		
//		ArrayList<String> myList = new ArrayList<String>();
		
//      Now we can only store String items in our ArrayList rather 
//      than any other data-types. This allows us more type safety
//      and saves us from getting errors.
		
		Container<Integer, String> container = new Container<>(12, "Hello");
		int val1 = container.getItem1();
		String val2 = container.getItem2();
		
		public static <E> Set union(Set<E> set1, Set<E> set2) {
			Set result = new HashSet(set1);
			result.addAll(set2);
			return result;
		}
		
		

	}

}