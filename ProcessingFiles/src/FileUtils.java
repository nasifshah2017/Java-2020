
public class FileUtils {
	
	public int subtract10FromLargerNumber(int number) throws Exception {
		if(number < 10) {
			throw new Exception("The number passed was smaller than 10");
		}
		int num = number-10;
		return num;
	}
}
