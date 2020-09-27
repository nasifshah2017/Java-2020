import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Application5 {

	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<String, String>();
		
		// Adding values in our HashMap
		
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant",  "exceptionally clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness");
		dictionary.put("Confidence", "the state of feeling certain about the truth of something.");
		
		// Traversing through our dictionary
		
		for(String i: dictionary.keySet()) {
			System.out.println(i);
		}
		
		// Output: 	Brilliant
		//			Joy
		//			Confidence
		//			Brave
		
		// As you can see items in a HashMaps() are also not stored
		// in an order rather they move around. Same like HashSet if 
		// we want to bring an order then we can use LinkedHashMap.
		
		LinkedHashMap<String, String> directory = new LinkedHashMap<String, String>();
		
		// Adding values in our HashMap
		
		directory.put("Brave", "ready to face and endure danger or pain; showing courage.");
		directory.put("Brilliant",  "exceptionally clever or talented.");
		directory.put("Joy", "a feeling of great pleasure and happiness");
		directory.put("Confidence", "the state of feeling certain about the truth of something.");
		
		// Traversing through our dictionary
		
		for(String i: directory.keySet()) {
			System.out.println(i);
		}
		
		// Output: 	Brave
		//			Brilliant
		//			Joy
		//			Confidence
		
		// Now if we want to get the values of each of the keys
		// then we do as following
		
		for(String i: directory.keySet()) {
			System.out.println(directory.get(i));
		}
		
		// Output: 	ready to face and endure danger or pain; showing courage.
		//			exceptionally clever or talented.
		//			a feeling of great pleasure and happiness
		//			the state of feeling certain about the truth of something.
		
		// Now if we want to get the keys and values together then we do as following
		
		for(Map.Entry<String, String> i: directory.entrySet()) {
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		}
		
		// Output:	Brave
		//			ready to face and endure danger or pain; showing courage.
		//			Brilliant
		//			exceptionally clever or talented.
		//			Joy
		//			a feeling of great pleasure and happiness
		//			Confidence
		//			the state of feeling certain about the truth of something.

		
		
		
		

	}

}
