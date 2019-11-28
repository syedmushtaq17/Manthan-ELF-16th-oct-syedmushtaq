import java.util.function.Consumer;

public class TestE {

	public static void main(String[] args) {

		Student st =new Student(21, "syed mushtaq", 66.67);
		
		Consumer<Student> c=s->{
			System.out.println("Name is "+s.name);
			System.out.println("AGE is "+s.age);
			System.out.println("PERCEnTEGAe iS "+s.percentage);
		};
		
		c.accept(st);
	}

}
