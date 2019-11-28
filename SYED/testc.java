class testc
{
    int sum(int a,int b){
	int c=a+b;
	return c;
	}
	double area(int r){
	double a=3.14*r*r;
	return a;
	}
	public static void main(String args[])
	{
	testc o =new testc();
	
	double ans=o.area(5);
	System.out.println(ans);
     int c=o.sum(10,20);
	System.out.println(c);
	}




}