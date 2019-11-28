import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {

		Student st =new Student(20, "ramya", 56);
		Predicate<Student> ps = s->{
			if(s.percentage>35) {
				return true;
			}
			else {
				return false;
			}
		};
		
		System.out.println("RESULT IS "+ ps.test(st));
	
		
	}

}
