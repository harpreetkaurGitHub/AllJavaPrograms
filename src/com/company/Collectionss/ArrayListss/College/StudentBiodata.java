package com.company.Collectionss.ArrayListss.College;



//pojo = plain old java object
public class StudentBiodata {
    private String name;
    private String rollNo;
    private String dept;
    private String city;

    public StudentBiodata(String name, String rollNo, String dept, String city) {
        this.name = name;
        this.rollNo = rollNo;
        this.dept = dept;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}