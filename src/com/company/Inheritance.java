package com.company;

public class Inheritance {
    int num = 20;

    public void display() {
        System.out.println("This is the display method of superclass");
    }
}

class Demo extends Inheritance {
    int num = 10;
    public void display() {
        System.out.println("This is the display method of subclass");
    }

    public void my_method() {
        Demo sub = new Demo();

        sub.display();
        System.out.println("value of the variable named num in sub class:"+ sub.num);

        super.display();
        System.out.println("value of the variable named num in super class:"+ super.num);
    }
    public static void main(String args[]) {
        Demo obj = new Demo();
        obj.my_method();
    }
}
