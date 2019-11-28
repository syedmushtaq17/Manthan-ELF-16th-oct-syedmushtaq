
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestI {

	public static void main(String[] args) {

		List<Integer> al=new ArrayList();
	
		al.add(10);
		al.add(5);
		al.add(2);
		al.add(8);
		al.add(7);
		
		
		Function<Integer, Integer> f=i->i*10;
		
		for(int i=0;i<al.size();i++) {
			System.out.println(i);
			al.set(i, f.apply(al.get(i)));	}
		
		List<Integer> bl=al.stream().map(f).collect(Collectors.toList());
		
		System.out.println(bl);
	}

}

