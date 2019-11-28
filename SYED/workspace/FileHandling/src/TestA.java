import java.io.File;
import java.io.IOException;

public class TestA {

	public static void main(String[] args) {

		File f=new File("karnataka/bangalore/SYEDsyed.txt");
		
		if(f.mkdirs())
			System.out.println("dodo");
		

		
		try {
		
			f.createNewFile();
			System.out.println("done");
		} catch (IOException e) {
			System.out.println("Undone");
			
		}
		
		
		
		
	}

}
