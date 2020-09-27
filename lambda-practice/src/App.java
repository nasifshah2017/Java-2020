
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human tom = new Human();
		// walker(tom);
		
		
		Robot wale = new Robot();
		// walker(wale);
		
		walker(() -> System.out.println("Custom object walking..."));
		
		// lambda expression
		Walkable aBlockOfCode = () -> {
			System.out.println("Custom object walking....");
			System.out.println("The object tripped...");
			};  
			
			walker(aBlockOfCode);
			
		ALambadaInterface helloVar =()-> {
				System.out.println("Hello!!!");
			};
			
			(a,b)->return arg1 +arg2;
		
		public int sum(int arg1, int arg2) {
			return arg1+arg2;
		}
	}
	
	public void sayHello() {
		System.out.println("Hello there...");
	}
	
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}

}
