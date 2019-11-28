class teste
{
   static int fact(int n){
  if(n==1)
 return 1;

  return n*fact(n-1);
}

    	public static void main(String args[])
	{
	int f=fact(7);
	
		System.out.print(f);
	}
    
}
