package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;

    public void setname(String name)
    {
        this.name=name;
    }
    public void setgender(String gender)
    {
        this.gender=gender;
    }
    public void setage(int age)
    {
        this.age=age;
    }
    public void prints()
    {
            System.out.println("name"+" "+name+" "+"gender"+" "+gender+" "+"age"+" "+age);
          //  System.out.print(" ");
    }
}
