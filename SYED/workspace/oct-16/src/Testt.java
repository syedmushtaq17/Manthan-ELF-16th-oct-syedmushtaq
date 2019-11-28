
public class Testt  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("****************** this is THird Gen*********");
   Thirdgen g=new Thirdgen();
   g.call();
   g.msg();
   g.radio();
   g.camera();
   
   Secondgen s=new Secondgen();
   System.out.println("****************** this is Secomd Gen*********");
   s.radio();
   s.call();
   s.msg();
   
   Firstgen f=new Firstgen();
   System.out.println("****************** this is First Gen*********");
   f.call();
   f.msg();
   
   
  
	}

}
