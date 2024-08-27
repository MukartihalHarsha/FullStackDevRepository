package com.gentech.oops;

abstract class AbstractClass 
{
    abstract void abstractMethod();

    void concreteMethod()
    {
        System.out.println("Concrete method in AbstractClass.");
    }
}
interface Interface1
{
   void method1();
}

interface Interface2 
{
   void method2();
}

public class assg2 extends AbstractClass implements Interface1, Interface2 
{

 @Override
 void abstractMethod() 
 {
     System.out.println("Implementation of abstractMethod in SubClass.");
 }

 @Override
 public void method1() 
 {
     System.out.println("Implementation of method1 from Interface1.");
 }

 @Override
 public void method2()
 {
     System.out.println("Implementation of method2 from Interface2.");
 }

 public static void main(String[] args)
 {
    
     assg2 obj = new assg2();
  
     obj.abstractMethod();
     obj.method1();
     obj.method2();
     obj.concreteMethod();  
 }
}

