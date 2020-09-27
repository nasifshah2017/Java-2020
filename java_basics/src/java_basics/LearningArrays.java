package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values;
		values = 100;	// Can only store single values
		
		// Initializing an Array with 100 slots
		// Its a fixed size, it can only store 100 elements
		int [] arrays = new int[100];
		
		// Now we want to store the number 1000 in our array
		// We can store it in a specific index like this
		arrays[2] = 1000;
		
		// The first index position of this array
		arrays[0] = 150;
		// The last index position of this array
		arrays[99] = 350;
		
		// Printing the value at a certain index position
		System.out.println(arrays[0]);	// 150
		System.out.println(arrays[10]);	// 0
		
		// If we don't assign any value in any slot or index
		// Then that slot or index is assigned to 0 by default
		
		// As this arrays is declared as an integer data-type
		// Thats why we cannot store any other type of data in 
		// it like 33.44 or 'Hello. It will only store whole
		// values.
		
		// Declaring double decimals array variable
		// That stores decimal values. 
		double [] decimals = new double[100];
		
		decimals[2] = 55.4;
		decimals[33] = 88.8;
		decimals[50] = 99.9;
		
		// Declaring String array variable
		// It only stores Strings
		String [] words = new String[] {"My", "name", "is"};
		
		// This array contains 3 strings
		System.out.println(words[2]);	// "is"
		
		String [] strings = new String[3];
		strings[0] = "Our";
		strings[1] = "plan";
		strings[2] = "finalized";
		
		System.out.println(strings[2]);	// "finalized"
		
		// Increasing the size of "strings" array
		strings = new String[10];

	}

}
