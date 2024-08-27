package com.gentech.return1;


class concatenation
{   
	character concat(character ch[])
	{    
		character c='';
		for(int i=0;i<ch.length;i++)
		{  
			c+=ch[i];
		}return c;
	}
}
public class Concatenationch {
	public static void main(String args[]) {
		concatenation o=new concatenation();
		character ch[]= {'G','A'};
		character c=o.concat(ch);			 
		System.out.println(c);
	}

}

