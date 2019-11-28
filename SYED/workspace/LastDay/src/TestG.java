import java.util.ArrayList;
import java.util.function.Predicate;

public class TestG {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList();
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
			System.out.println(al.get(i) +" is  odd");
			
			else
				System.out.println(al.get(i) +" is  even");
		}
		System.out.println();
		
		
	}

}
