package com.gentech.return1;

class Rect{
	static double fun(int l,int b) {
		double area=l*b;
		return area;
	}
}
public class Rectangle {

	public static void main(String[] args) {
		int l=3;
		int b=5;
		double res=Rect.fun(l,b);
		System.out.println(res+" ");

	}

}
