import java.io.FileWriter;
import java.io.IOException;

public class TestC {

	public static void main(String[] args) {

		String msg="helllllo joey";
		
		char ch[]=msg.toCharArray();
		
		try (	FileWriter fw=new FileWriter("qspides.text")){
		
			fw.write(ch);
			fw.flush();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
		
	}

}
