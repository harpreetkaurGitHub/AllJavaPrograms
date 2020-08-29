package com.company.constructor;

public class Chaining {

    public String tannuKaName;
    public int tannuKiId;

    public Chaining() {
        this(": My name is Tannu");
        System.out.println("This is default const");
    }
    public Chaining(String name) {

        this(name,40) ;
    }
    public Chaining(String name,int id){
        this.tannuKaName=name;
        this.tannuKiId=id;
    }
    void dis() {
        System.out.println("Padosi ko name batao" + tannuKaName);
        System.out.println("Padosi ko id batao :" + tannuKiId);
        System.out.println(tannuKaName+" "+ "and id is :" + tannuKiId);
    }

    public static void main(String[] args) {
        Chaining obj = new Chaining();
        obj.dis();
    }
}
