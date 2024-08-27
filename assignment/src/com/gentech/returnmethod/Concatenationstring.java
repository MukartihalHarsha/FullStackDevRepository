package com.gentech.returnmethod;

class concatenation
{   
	String concat(String str[])
	{    
		String s="";
		for(int i=0;i<str.length;i++)
		{  
			s+=str[i];
		}return s;
	}
}
public class Concatenationstring {
	public static void main(String args[]) {
		concatenation o=new concatenation();
		String str[]= {"GenTech","Academy"};
		String s=o.concat(str);			 
		System.out.println(s);
	}

}
