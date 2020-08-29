package com.company.Collectionss.ArrayListss.College;

import java.util.Collections;
import java.util.Scanner;

import static com.company.Collectionss.ArrayListss.College.Student.*;

public class MainStudent {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Student student= new Student("Tannu","CSE",1234);
        Student student1= new Student("Harpreet","IT",12344);
        Student student2= new Student("sahil","EC",12345);

        addStudentByDept("CSE",student);

//  add("CSE",new Student (""name))
        Collections.sort(studentList);

        removeStudentName("SAHIL");
        System.out.println("student after remove");
        for (Student stu : studentList){
            System.out.println("name " + stu.getName() + "   dept : " + stu.getDept());
        System.out.println();
    }

    }
    public static void addStudentName(String name , String dept) {
        System.out.println("Add student in your Department");
    }
    public static void removeStudentID(String name,String dept) {
        int index = scanner.nextInt();
        scanner.nextLine();
        studentList.remove(index);
    }

}


// papa ethe hi beh gye ne mai normal talk krunga thik>????