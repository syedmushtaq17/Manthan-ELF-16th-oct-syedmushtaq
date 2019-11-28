import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestF {

	public static void main(String[] args) {
		
		Supplier<Student> s= ()-> new Student(22, "Khan", 21.214);
		
		Student ss=s.get();
		System.out.println("Name is "+ss.name);
		System.out.println("AGE is "+ss.age);
		System.out.println("PERCEnTEGAe iS "+ss.percentage);
	}

}
