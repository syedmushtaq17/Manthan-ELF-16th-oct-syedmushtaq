import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestF {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin =new FileInputStream("myDBConfig.properties");
			Properties pr=new Properties();
			pr.load(fin);
			
			String user =pr.getProperty("user");
			String url =pr.getProperty("url");
		System.out.println("User is "+user);
		System.out.println("Url is "+url);
			
		} catch ( IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
