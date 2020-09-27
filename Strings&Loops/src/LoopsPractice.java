
public class LoopsPractice {
	
	public static void main(String args[]) {
		String str = "We have a large inventory of things in our warehouse falling in "
				+ "the category:apparal and the slightly "
				+ "more in demand category:makeup along with the category:furniture and....";
				
				printCategories(str);
	}
	
	/**
	 * extract all categories from the string argument
	 * @param str *
	 **/
	
	public static void printCategories(String str) {
		
/*		int startingApparel = str.indexOf("apparel");
//		System.out.println(startingApparel);           	// 77
		String apparel = str.substring(77,84);
		System.out.println(apparel);
		int startingMakeup = str.indexOf("makeup");
//		System.out.println(startingMakeup);				// 126
		String makeup = str.substring(126,132);
		System.out.println(makeup);
		int startingFurniture = str.indexOf("furniture");
//		System.out.println(startingFurniture); 			// 157
		String furniture = str.substring(157,166);
		System.out.println(furniture);
*/

		int i = 0;
		while (true) {
			int found = str.indexOf("category:", i);
			if (found == -1) break;
			int start = found + 9; // Start of the actual category
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			i = end + 1;
		}
		
	}
	
	
}
