package com.company;

class ABC{
    public void myMethod(){
        System.out.println("Overridden Method");
    }

}
class XYZ extends ABC{

    public void myMethod(){
        System.out.println("Overriding Method");
    }
}

public class Polymorphism{
    int add(int a, int b)
    {
        return a+b;
    }
    int  add(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String args[]){
        ABC obj = new XYZ();
        Polymorphism obj1 = new Polymorphism();
        obj.myMethod();
        System.out.println(obj1.add(10, 20));
        System.out.println(obj1.add(10, 20, 30));
    }
}
