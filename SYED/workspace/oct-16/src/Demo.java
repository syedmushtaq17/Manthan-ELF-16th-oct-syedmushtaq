
public class Demo {
	 
	int i;
	static int j;
	void eat() {
		System.out.println("eat");
	}
	static void run() {
		System.out.println("run");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Demo.run();
		 Demo d=new Demo();
		 d.eat();
		 d.run();
	}

}
