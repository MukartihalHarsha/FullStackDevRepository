package com.gentech.return1;

class Assg6{
	boolean logical(int x) {
		if(x<20 && x!=0) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class Ass6 {

	public static void main(String[] args) {
		int x=20;
		Assg6 o=new Assg6();
		boolean res=o.logical(x);
		System.out.println(res+"");
		
	}

}
