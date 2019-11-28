
public class Crush {

	void receive(Phone p) {
		if(p instanceof Mi)
		{
			System.out.println("Thank you brother");
		}
		else if(p instanceof Pixel)
		{
			System.out.println("Thank you Dear");
		}
		else if(p instanceof Iphone)
		{
			System.out.println("I Love You");
		}
		else
		{
			System.out.println("Non-sense");
		}
	}
}
