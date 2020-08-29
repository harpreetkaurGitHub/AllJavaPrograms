package com.company.Udemy.Arrays;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        groceryList.add(item);
    }
    public void printItem() {
        System.out.println("you have " + groceryList.size() + "items in your list");
        for (int i=0 ; i<groceryList.size() ; i++) {
            System.out.println(groceryList.get(i));
        }
    }
    public void modifyItem(int position , String newItem) {
        groceryList.set(position,newItem);
        System.out.println("Grocery Item "+ position +" has been modified");
    }
    public void removeItem(int position) {
        groceryList.remove(position);
    }
    public String findItem(String serchedItem) {
//        boolean findItem = groceryList.contains(position);

        int position = groceryList.indexOf(serchedItem);
        if (position >=0) {
            return groceryList.get(position);
        }
        return null;
    }
}
