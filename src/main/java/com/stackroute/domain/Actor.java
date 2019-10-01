package com.stackroute.domain;

public class Actor {

    private String name;
    private String gender;
    private int age;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


   public Actor()
   {}

    public void prints()
    {
            System.out.println("name"+" "+name+" "+"gender"+" "+gender+" "+"age"+" "+age);
          //  System.out.print(" ");
    }
}
