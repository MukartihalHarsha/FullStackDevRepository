package com.gentech.methods;
class Sumprime1
{
	void sumofprime()
	{       
		int sum=0;
		for(int i=50;i<=150;i++)
		{    
			int flage=0;
			for (int j = 2; j * j <= i; j++)
			{
				if(i%j==0) 
				{  
					flage+=1;
					break;					 
				} 

			}
			if(flage==0)
			{
				System.out.println(i);
				sum+=i;
			}

		}System.out.print("Sum Of Prime No b/w 50-150 : "+sum);
	}
}

public class SumPrime {

	public static void main(String[] args) {
		Sumprime1 o=new Sumprime1();
		o.sumofprime();




	}

}
