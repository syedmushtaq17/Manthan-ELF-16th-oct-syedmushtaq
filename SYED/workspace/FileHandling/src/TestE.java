import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestE {

	public static void main(String[] args) {

		Properties pr=new Properties();
		pr.setProperty("driverName", "com.mysql.jdbc.Driver");
		pr.setProperty("url", "jdbc:mysql://localhost:3306");
		pr.setProperty("user", "root");
		pr.setProperty("password", "root");
		
		try {
			FileOutputStream fout =new FileOutputStream("myDBConfig.properties");
			pr.store(fout, "storing data");
			System.out.println("dddd");
		} catch (  IOException e) {

			e.printStackTrace();
		}
		
		
	}

}
