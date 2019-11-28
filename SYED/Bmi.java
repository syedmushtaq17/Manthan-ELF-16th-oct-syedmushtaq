class Bmi
{
	public static void  main(String args[])
	{
	double h=1.75;
	double w=130;
	double bmi=w/(h*h);
	System.out.println(bmi);

	if(bmi>18.5 && bmi<25)
	System.out.print("Normal");
	else if(bmi>25 && bmi<30)
	System.out.print("over weight");
	else if(bmi>30)
	System.out.print("obese");
	else 
	System.out.print("under weight");

	}
}