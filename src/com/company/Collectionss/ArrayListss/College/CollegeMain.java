package com.company.Collectionss.ArrayListss.College;

import static com.company.Collectionss.ArrayListss.College.College.addStudent;
import static com.company.Collectionss.ArrayListss.College.College.removeStudent;

public class CollegeMain {


    public static void main(String[] args) {

        StudentBiodata studentBiodata = new StudentBiodata("sahil","1234","CSE","delhi");
        StudentBiodata studentBiodata1 = new StudentBiodata("tannu","12343","CSE","delhi");
        StudentBiodata studentBiodata2 = new StudentBiodata("Harpreet","123433","CSE","delhi");
        StudentBiodata studentBiodata3 = new StudentBiodata("ishu","1234333","IT","delhi");

        addStudent(studentBiodata);
        addStudent(studentBiodata1);
        addStudent(studentBiodata2);
        removeStudent("CSE","sahil");
    }

}
