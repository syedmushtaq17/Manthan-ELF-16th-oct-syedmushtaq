
public class ex {

	public static void main(String[] args) {

		System.out.println("Main started");
		try {
			
		System.out.println(10/0);
	}
		catch(ArithmeticException e) {
			System.out.println("Please donot divide by zero");
		}
		System.out.println("main ended");
		}

}
