import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestD {

	public static void main(String[] args) {

		try {
			
			FileReader fr=new FileReader("fout.txt");
			
			int m;
			while ((m=fr.read())!=-1) {
				System.out.print((char)m);
				
			}
			
			
		} catch (IOException e) {

			
			
			e.printStackTrace();
		}
		
	
	
	}

}
