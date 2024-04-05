package com.example.abstracts;

public abstract class Person {

        public void eat() {
            System.out.println("eat");
        }


        public abstract void say();
}

 class  Student extends Person {
    @Override
    public void say() {
        System.out.println("say   student");
    }
}

class  Master extends Person {
    @Override
    public void say() {
        System.out.println("say   Master");
    }
}

class Demo{
    public static void main(String[] args) {
        Person student = new Student();
        student.say();

        Person master = new Master();
        master.say();
    }
}
