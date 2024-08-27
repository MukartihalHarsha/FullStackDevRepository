package com.gentech.return1;

class Area{
	static double funct(int r) {
		double area=3.14*r*r;
		return area;
		}
}
public class Circle {

	public static void main(String[] args) {
		int r=5;
		double res=Area.funct(r);
		System.out.println(res+" ");

	}

}
