package com.manthan.lambda;

public class TestB  {



	public static void main(String[] args) {

		Fact f=(n)->{
			int s=1;
			for(int i=2;i<=n;i++)
				s=s*i;
			return s;
		};

		System.out.println(f.fact(5));
	}

}
