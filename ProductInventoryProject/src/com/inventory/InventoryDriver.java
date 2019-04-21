package com.inventory;
import java.util.Scanner;
public class InventoryDriver
{
    public static void main(String[] args)
    {
        boolean running = true;
        Inventory inv = new Inventory();
        Product hammers = new Product(10, 30, "Hammer");
        Product saws = new Product(3, 300, "Saws");
        inv.addProduct(hammers);
        inv.addProduct(saws);
        System.out.println(inv.getTotalValue());
        System.out.println(inv.sumUp());
        
        while(running)
        {
            running = askChoice();
        }

    }

    private static boolean askChoice()
    {
        System.out.println("What do you wish to do?");
        System.out.println("Press 1 to add a product.");
        System.out.println("Press 2 to remove a product.");
        System.out.println("Press 3 to view current holdings.");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (checkChoice(choice))
        {
            System.out.println("All good, please proceed.");
            return false;
        }
        else
        {
            System.out.println("Sorry but" + choice + "is not an available choice. Try again.");
            return true;
        }

        
    }

    private static boolean checkChoice(String c)
    {
        int choice = Integer.parseInt(c);
        boolean correctChoice = false;
        switch(choice)
        {
            case 1:
            case 2:
            case 3:
                correctChoice = true;
                break;
        }

        return correctChoice;
    }
}