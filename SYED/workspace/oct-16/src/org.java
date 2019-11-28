
public class org {

	 int count;
	 static int orgcount;
	 void swipe() {
		 count++;
		 orgcount++;
	 }
	 void num() {
		 System.out.println("count of this institute is "+ count);
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  org o=new org();
  o.swipe();
  org oo=new org();
  oo.swipe();
  org r=new org();
  r.swipe();
  System.out.println("total count "+org.orgcount);
		
		
	}

}
