import java.util.function.Function;

public class TestC {

	public static void main(String[] args) {

		Function<String, Integer> fn =x->x.length();
		int ans=fn.apply("priya");
		System.out.println("Lenght is "+ ans);
		
	}

}
