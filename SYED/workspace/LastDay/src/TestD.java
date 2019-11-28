import java.util.function.Function;

public class TestD {

	public static void main(String[] args) {
		
		Student st =new Student(21, "syed mushtaq", 66.67);
		Function<Student, Student> fn= s->{
			st.percentage=st.percentage+4;
			
		return st;
		};
		
		Student s=fn.apply(st);
		
		
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.percentage);
		
		
	}

}
