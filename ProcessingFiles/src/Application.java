import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args){
		
//		for (int i=0; i<=3; i++) {
//			// TODO Auto-generated method stub
//			Scanner input = new Scanner(System.in);
//			System.out.println("Enter some Text: ");
//			String enteredText = input.nextLine();
//			System.out.println(enteredText);
//		}
		
	try {
		File file = new File("file.txt");
		Scanner input;
		
			input = new Scanner(file);
		 
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();

	} catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
		FileUtils myUtil = new FileUtils();
		try {
			myUtil.subtract10FromLargerNumber(15);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
