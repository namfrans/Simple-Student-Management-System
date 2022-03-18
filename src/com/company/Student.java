package com.company;

public class Student {
    private String Firstname;
    private String Lastname;
    private String Gender;
    private String Student_number;
    private int age;

    //Getters
    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getGender() {
        return Gender;
    }

    public String getStudent_number() {
        return Student_number;
    }

    public int getAge() {
        return age;
    }

    //Setters

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setStudent_number(String student_number) {
        Student_number = student_number;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Constructors

    //Default constructor
    public void Student(){

    }

    public Student(String firstname, String lastname, String gender, int age) {
        Firstname = firstname;
        Lastname = lastname;
        Gender = gender;
        Student_number = "22201";
        this.age = age;
    }

    //toString method

    @Override
    public String toString() {
        if (age < 0){
            return "===================================="+"\nProvide a valid student age!!"+ "\n====================================";
        }else{
            return "\nStudent" +
                    "\n_____________________________________\n"+
                    "\nFirstname: " + Firstname +
                    "\nLastname: " + Lastname +
                    "\nGender: " + Gender +
                    "\nStudent Number: " + Student_number +
                    "\nAge:" + age
                    +"\n====================================\n";
        }
    }
}
