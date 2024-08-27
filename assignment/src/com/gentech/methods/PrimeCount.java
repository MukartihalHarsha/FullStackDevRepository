package com.gentech.methods;
class Countprime
{
	int countprime()
	{
		int count = 0;
		int flage=0;
		for (int i = 50; i <= 150; i++) 
		{

			for (int j = 2; j * j <= i; j++) 
			{
				if (i % j == 0) 
				{
					flage+=1;
					break;
				}
			}
			if (flage==0) 
			{
				count++;
			}
		}
		return count;
	}
}



public class PrimeCount {

	public static void main(String[] args) {
		Countprime o=new Countprime();
		o.countprime();


	}

}