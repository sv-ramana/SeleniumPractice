package com.practice.framework.samplepractise;

import java.time.LocalDate;

public class Main {
    private String name;
        int x;
        int nums;
        final int y;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Encapsulation above
    public Main(int num, String val) {
            x = 10;
            y = 5;
            nums = num;
            String valu = val;
        }
        static void mymethod() {
            System.out.print("static method calling in run time without creating object");
        }
        public void anothermethod() {
            System.out.print("Creating object it will execute in compile time only because its non static");
        }

    public static void main(String[] args) {
        Main objref = new Main(12, "value");
        System.out.println(objref.x);
        System.out.println(objref.nums);
        //System.out.print(objref.valu); it wont call
        mymethod();
        objref.anothermethod(); // Calling creting object beacuse non static & will excuted compile time
        // Final Access Modifier
        System.out.println(objref.y);
        //objref.y = 10; // cannot change the value in final access modifuied
        // Private access modifier will only use in the same inside class
        // For Encapsulation acheive
        objref.setName("venky");
        System.out.println(objref.getName());
        LocalDate myObjtime = LocalDate.now(); // Create a date object
        System.out.println(myObjtime);
    }
}

