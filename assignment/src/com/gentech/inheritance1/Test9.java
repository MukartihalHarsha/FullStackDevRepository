package com.gentech.inheritance1;

public class Test9
{
    void instanceMethod() 
    {
        System.out.println("Instance method called");
    }

    static void staticMethod()
    {
        System.out.println("Static method called");
    }
    static
    {
        staticMethod();

        Test9 example = new Test9();
        example.instanceMethod();
    }

    public static void main(String[] args) {
       
    }
}

