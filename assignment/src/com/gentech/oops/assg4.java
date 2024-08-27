package com.gentech.oops;

class Number 
{
 int value;
 Number(int value) 
 {
     this.value = value;
 }
}

public class assg4
{

 static void modify(Number num)
 {
     num.value += 10;  
 }

 public static void main(String[] args) 
 {
     Number myNumber = new Number(5);
     System.out.println("Before modification: " + myNumber.value);
     modify(myNumber);
     System.out.println("After modification: " + myNumber.value);
 }
}

