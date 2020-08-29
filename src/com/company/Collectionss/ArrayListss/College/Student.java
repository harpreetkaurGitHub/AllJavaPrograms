package com.company.Collectionss.ArrayListss.College;

import java.util.*;

public class Student implements Comparable<Student> {

    private String name;
    private String dept;
    private int id;

    public static List<Student> studentList = new ArrayList<>();
    public static Map<String,List<Student>> studentMapList = new HashMap<>();

    Student(String name , String dept ,int id){
        this.name = name;
        this.dept = dept;
        this.id = id;
    }

    //remove student by Dept  and name
   // get student by name and dept;

    public static void addStudentByDept(String dept,Student student){
//        if(Objects.isNull(studentMapList.get(dept))){
//            List<Student> studentList = new ArrayList<>();
//            studentList.add(student);
//            studentMapList.put(dept,studentList);
//        }else{
//            List<Student> stunList= studentMapList.get(dept);
//            stunList.add(student);
//            studentMapList.put(dept,stunList);
//
//
//          // studentMapList.get(dept).add(student);
////        }

        List<Student> stunList= studentMapList.get(dept);
        stunList.add(student);
        studentMapList.put(dept,stunList);
    }

    public static void removeStudentByNameDept(String name , String dept) {
        if (studentMapList.containsKey(name) || studentMapList.containsValue(dept)) {
//            studentMapList.remove()
        }
    }

    public String getName() {
        Student ss= new Student("name ","dept",133);
        Student ss1= new Student("name ","dept",133);
        Student ss2= new Student("name ","dept",133);
        Student ss3= new Student("name ","dept",133);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addStudentName(Student student) {
        studentList.add(student);
    }

    public static void removeStudentName(String stent) {
       for (int i=0 ; i<studentList.size() ; i++) {
           if (studentList.get(i).getName().equals(stent)) {
               studentList.remove(i);
           }
       }
    }

    public static List<Student> getDeptByName(String deptName){

        List<Student> deptList = new ArrayList<>();

        for (int i=0 ; i<studentList.size() ; i++) {
            if (studentList.get(i).getDept().equalsIgnoreCase(deptName)){
                deptList.add(studentList.get(i));
            }
        }
        return deptList;
    }

    public static Student getStudentById(int id) {
        for (int i=0 ; i <studentList.size() ; i++) {
            if (studentList.get(i).getId()==id) {
                return studentList.get(i);
            }
        }
        return null;
    }

    @Override
    public int compareTo(Student o) {
       return this.name.compareTo(o.name);
    }
}
