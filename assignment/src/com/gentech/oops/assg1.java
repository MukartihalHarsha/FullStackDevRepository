package com.gentech.oops;
class A {
 A(int x) {
     System.out.println("Parameterized constructor of A: " + x);
 }
}

class B {
 B(int y) {
     System.out.println("Parameterized constructor of B: " + y);
 }
}

class C extends A {
 B b;

 C(int x, int y) {
     super(x);
     b = new B(y); 
     System.out.println("Constructor of C");
 }
}

public class assg1 {
 public static void main(String[] args) {
     C obj = new C(10, 20);
 }
}

