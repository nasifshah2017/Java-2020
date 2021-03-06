
public class StringsPractice {
	public static void main(String[] args) {
	//	 System.out.println("hello world!");
		
		String m = "shawn";
		System.out.println(m.length());					// 5
		
		String str = "ABCDEFG";
		int x = str.length();
		System.out.println(x);              			// 7
		
		// This built-in Java method substring() extracts 
		// certain parts of the string out
		
		String extractedString = str.substring(1);
		System.out.println(extractedString); 			// BCDEFG
		
		String extractedString1 = str.substring(2);
		System.out.println(extractedString1); 			// CDEFG
		
		String extractedString2 = str.substring(0,2);
		System.out.println(extractedString2); 			// AB
		
		String extractedString3 = str.substring(1,3);
		System.out.println(extractedString3); 			// BC
		
		String extractedString4 = str.substring(3,6);
		System.out.println(extractedString4); 			// DEF
		
		String extractedString5 = str.substring(3,7);
		System.out.println(extractedString5);         	// DEFG
		
		String a = "hello";
		String b = "there";
		
//		if(a == "hello") {
			// THIS IS A TRP. DON'T DO THIS
//		}
		
		if(a.equals("hello")) {
			// USE THIS !!!
		}
		
		// In case of Strings in Java, this is how
		// the comparison operator is used
		
		if(b.equals("there")) { 					// equal to "=="
			System.out.println("Printed there");  	// Printed there
		}
		
		if(b.equalsIgnoreCase("There")) {			// not equal to "!="
			System.out.println("Denied");			// Denied
		}
		
		// The built-in charAt() method is used to identify
		// what character is stored at a particular index
		
		String c = "Canada";
		char identity = c.charAt(3);
		
		System.out.println(identity); 				// a
		
		// The "char" data-type only stores a single character
		// and it uses single-quote ('') instead of double quotes
		// around its character value.
		
		char myChar = 'H';
		char myChar1 = '}';
		char myChar2 = '0';
		
		System.out.println(myChar);
		System.out.println(myChar1);
		System.out.println(myChar2);
		
		// The indexOf() method is normally applied on strings,
		// It can take up to two arguments. The first argument 
		// it takes is a string and if we are only passing a string
		// as its argument and not any other argument then the indexOf()
		// method returns the index of the first character of the 
		// string that we passed as an argument.
		
		String line = "Hello there yogi ";
		
		int t = line.indexOf("there");
		
		System.out.println(t); 						// 6
	}
}
