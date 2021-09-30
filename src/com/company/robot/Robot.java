package com.company.robot;

public class Robot {
    private String name;
    private int age;
    private int power;

    public Robot (String name,int age,int power){
        this.name = name;
        this.age = age;
        this.power = power;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getPower(){
        return power;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPower(int power){
        this.power = power;
    }




}
