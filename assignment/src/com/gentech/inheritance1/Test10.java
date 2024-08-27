package com.gentech.inheritance1;

public class Test10
{
    void MyClass() 
    {
        instanceMethod();
        staticMethod();
    }
    void instanceMethod() 
    {
    	{
        System.out.println("This is an instance method.");
    	}
        
    }
    static void staticMethod()
    {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) 
    {
        Test10 o1=new Test10();
    }
}

