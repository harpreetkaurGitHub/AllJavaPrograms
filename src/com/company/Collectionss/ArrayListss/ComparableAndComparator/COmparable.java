package com.company.Collectionss.ArrayListss.ComparableAndComparator;

public class COmparable implements Comparable<COmparable> {
    private int Marks;
    private String Name;

    public COmparable(int marks,String name){
        this.Marks = marks;
        this.Name = name;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public int compareTo(COmparable o) {
        if(this.Marks > o.Marks) {
            return -1;
        }
        else if (this.Marks < o.Marks) {
            return 1;
        }
        return 0;
    }
}
