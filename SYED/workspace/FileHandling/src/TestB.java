import java.io.FileOutputStream;
import java.io.IOException;

public class TestB {

	public static void main(String[] args) {

		String msg="Hi how are you doing";
		byte[]b=msg.getBytes();
	
		
		
		try (FileOutputStream fout=new FileOutputStream("qspiders1.txt")){
			
			fout.write(b);
		} catch (IOException e) {

		e.printStackTrace();
		}
		
		
	}

}
