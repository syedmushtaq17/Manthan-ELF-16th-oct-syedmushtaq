package object;

public class TestA {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		
		//this returns fully qualified path name and hexadecimal values;
		
		Student ss=new Student("priya", 1, 78.6);
		Student t=new Student("priya", 1, 78.6);
		Child c=new Child("priya", 1, 78.6);
		
		System.out.println(t.getClass());
		//here t  and s have same arguments but still its showing false.
		System.out.println(c.equals(t));
	// cause compiler doesn't now how to compare user defined objects.
		//we must override it to use it our way. 
		
		System.out.println(ss.toString());
	}
	
}
