package com.Section6;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>100 || age<0) this.age=0;
        else this.age = age;
    }

    public boolean isTeen(){
        if(this.age<20 && this.age>12) return true;
        else return false;
    }

    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }
        else if(this.firstName.isEmpty()){
            return this.lastName;
        }
        else if(this.lastName.isEmpty()){
            return this.firstName;
        }
        else return firstName+" "+lastName;


    }
}
