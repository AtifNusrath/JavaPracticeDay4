package com.company;

public class ConstructorDemo {

    String language,demo;
    int number;

        // constructor with no parameter
        ConstructorDemo() {
            System.out.println("Constructor with no parameter");
            this.language = "Java";
        }

        // constructor with a single parameter
        ConstructorDemo(String language) {
            System.out.println("single parameter Constructor");
            this.language = language;
        }

        public void getName() {
            System.out.println("Programming Language : " + this.language+"\n");
        }

        public static void main(String[] args) {

           //Default Constructor
            ConstructorDemo obj = new ConstructorDemo();
            System.out.println("Default Value:");
            System.out.println("String = " + obj.demo);
            System.out.println("Number = " + obj.number);

            // call constructor with no parameter
            ConstructorDemo obj1 = new ConstructorDemo();
            obj1.getName();

            // call constructor with a single parameter
            ConstructorDemo obj2 = new ConstructorDemo("Python");
            obj2.getName();
        }
    }


