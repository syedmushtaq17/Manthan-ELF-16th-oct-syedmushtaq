import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestH {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList();
		ArrayList<Integer> alodd=new ArrayList();
		ArrayList<Integer> aleven=new ArrayList();
		al.add(10);
		al.add(5);
		al.add(2);
		al.add(8);
		al.add(7);
		System.out.println(al);
		
		Predicate<Integer> p= a->{
		
			if(a%2!=0) {
				return true;
			}
			else {
				return false;
			}
			
		};
		
		for (int i=0;i<al.size();i++) {
			if(p.test(al.get(i)))
			alodd.add(al.get(i));
			
			else
				aleven.add(al.get(i));
		}
		
		System.out.println(alodd);
		System.out.println(aleven);
		
		
		List<Integer> bl=al.stream().filter(p).collect(Collectors.toList());
		// return type is list not arraylist parent return type so 
		//downcast it
		ArrayList<Integer> bll=(ArrayList<Integer>) al.stream().filter(p).collect(Collectors.toList());
		System.out.println(bl);
		
	}
	
	
	
	

}
