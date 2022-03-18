package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Array list to store student objects
    ArrayList<Student> list = new ArrayList<Student>();

    Scanner input = new Scanner(System.in);
    public void Menu(){
        System.out.print("====================================\n");
        System.out.println("1. Enter new student.");
        System.out.println("2. Remove student.");
        System.out.println("3. Search Student.");
        System.out.println("4. Show Students registered.");
        System.out.println("5. Assign registered students, student numbers.");
        System.out.println("6. Exit.");
    }
    private Student regStudent(){
        System.out.print("\n==================================\n");
        System.out.print("Firstname: ");
        String firstname = input.next();
        System.out.print("Lastname: ");
        String lastname = input.next();
        System.out.print("Gender: ");
        String gender = input.next();
        System.out.print("Age: ");
        int age = input.nextInt();

        Student student = new Student(firstname, lastname, gender, age);
        return student;
    }
    public void addStudent(Student obj){
        list.add(obj);
    }
    public void giveStudentNumber(){
        for (int i = 0; i < list.size(); i++){
            String stdNum = list.get(i).getStudent_number();
            String fullStdNum = stdNum + String.format("%03d", i);
            list.get(i).setStudent_number(fullStdNum);
        }
    }
    public void deleteStudent(String id){
        for (Student stdnt: list){
            if (stdnt.getStudent_number().equals(id)){
                System.out.println("You have removed: "+list.remove(stdnt));
            }
        }
    }
    public void searchStudent(String name){
        for (Student stdnt: list){
            if (stdnt.getFirstname().equals(name)){
                System.out.println("You have searched for: "+stdnt);
            }
        }
    }
    public void showList(){
        int count = 0;
        while(count < list.size()){
            System.out.println(list.get(count));
            count++;
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner kbd = new Scanner(System.in);
        int option;
        do{
           main.Menu();
           option = kbd.nextInt();
           switch (option){
               case 1:
                   Student newStudent = main.regStudent();
                   if(newStudent.getAge() > 0){
                       main.addStudent(newStudent);
                   }else {
                       System.out.println(newStudent);
                       break;
                   }
                   break;
               case 2:
                   System.out.print("Enter item to delete student number: ");
                   String studentNo = kbd.next();
                   main.deleteStudent(studentNo);
                   break;
               case 3:
                   System.out.print("Enter item to search firstname: ");
                   String firstname = kbd.next();
                   main.searchStudent(firstname);
                   break;
               case 4:
                   main.showList();
                   break;
               case 5:
                   main.giveStudentNumber();;
                   break;
               case 6:
                   System.exit(1);
                   break;
           }
        }while(option != 6);
    }
}
