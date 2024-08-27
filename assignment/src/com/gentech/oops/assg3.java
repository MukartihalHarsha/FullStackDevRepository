package com.gentech.oops;

abstract class AbstractClass 
{
    static 
    {
        System.out.println("Static block of AbstractClass executed.");
    }
    void instanceMethod()
    {
        System.out.println("Instance method of AbstractClass executed.");
    }
}
class SubClass extends AbstractClass 
{
    SubClass() 
    {
        System.out.println("Constructor of SubClass executed.");
    }
}
public class assg3 
{
    public static void main(String[] args) 
    {
        SubClass obj = new SubClass();
        obj.instanceMethod();
    }
}

