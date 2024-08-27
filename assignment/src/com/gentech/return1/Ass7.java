package com.gentech.return1;

class Assg7{
	int func() {
		int x=2;
		int sum=0;
		for(int i=1;i<=10;i++) {
			int res=x*i;
			sum=sum+res;
		}
		return sum;
	}
}
public class Ass7 {

	public static void main(String[] args) {
		Assg7 o=new Assg7();
		int res=o.func();
		System.out.println(res+"");

	}

}