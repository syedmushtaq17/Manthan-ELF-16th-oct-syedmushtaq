
public class Test {

	public static void main(String[] args) {
		Chips s=new Chips();
		 Lays l=new Lays();
		Cat c=new Cat();
		c.receive(s);
		System.out.println("---------------------------------");
		c.receive(l);
     
     
	}

}
