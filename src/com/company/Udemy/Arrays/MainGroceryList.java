package com.company.Udemy.Arrays;
import java.util.Scanner;

public class MainGroceryList {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice=0;
        printInstructions();

        while (!quit) {
            System.out.println("Enter Your Choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printItem();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
    }
    public static void printInstructions() {
        System.out.println("Press");
        System.out.println("Press 0 - to print choice options");
        System.out.println("Press 1 - to print list of the grocery items");
        System.out.println("Press 2 - to add an item to the list");
        System.out.println("Press 3 - to modify an item in the list");
        System.out.println("Press 4 - to remove item from the list");
        System.out.println("Press 5 - to search an item in the list");
        System.out.println("Press 6 - to quit the application");
    }

    public static void addItem() {
        System.out.print("Please add the item into the list :: ");
        groceryList.addItem(scanner.nextLine());
    }
    public static void modifyItem() {
        System.out.print("Enter Item number:: ");
        int itemNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("replace the item :: ");
        String newItem = scanner.nextLine();
        groceryList.modifyItem(itemNum,newItem);
    }
    public static void removeItem() {
        System.out.print("Remove item from the list :: ");
        int itemNum = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeItem(itemNum);
    }
    public static void searchForItem() {
        System.out.print("Search the item from the list :: ");
        String scearchItem = scanner.nextLine();
        if (groceryList.findItem(scearchItem) != null) {
            System.out.println(scearchItem);
        }
        else {
            System.out.println(scearchItem + " is not in your grocerylist");
        }
    }

}
