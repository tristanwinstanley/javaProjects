package inventory;
import java.util.Scanner;
public class InventoryDriver
{
    private static Scanner scanner = new Scanner(System.in);
    private static Inventory inv = new Inventory();

    public static void main(String[] args)
    {
        boolean running = true;
        //System.out.println(inv.getTotalValue());
        //System.out.println(inv.sumUp());
        
        while(running)
        {
            running = askChoice();
            myPrint("");
        }
        myPrint("Good Bye");

    }

    private static boolean askChoice()
    {
        myPrint("What do you wish to do?");
        myPrint("Press 1 to add a product.");
        myPrint("Press 2 to remove a product.");
        myPrint("Press 3 to view current holdings.");
        myPrint("Press 4 to view total inventory value.");
        myPrint("Enter quit to exit the application.");
        
        String choice = scanner.nextLine();
        switch(choice)
        {
            case "1":
                myPrint("What would you like to add?");
                String id = makeChoiceString("Please state product id");
                int price = makeChoiceNb("Please state product price");
                int quantity = makeChoiceNb("Please state product quantity");
                if (inv.addProduct(new Product(price, quantity, id)))
                {
                    myPrint("Your product was succesfully added.");
                }
                else
                {
                    myPrint(id + " has already been added before.");
                }
                return true;

            case "2":
                myPrint("Which product would you like to remove?");
                inv.showInventory();
                choice = scanner.nextLine();
                if (inv.removeById(choice))
                {
                    myPrint("Your product was succesfully removed.");
                }
                else
                {
                    myPrint(choice + " is not a valid id");
                }
                return true;

            case "3":
                inv.showInventory();
                return true;

            case "4":
                myPrint(inv.getTotalValue());
                return true;
            case "quit":
                return false;

            default:
                myPrint("Sorry but " + choice + " is not an available choice. Try again.");
                return true;
        }        
    }

    private static String makeChoiceString(String question)
    {
        //Checks if string is not empty
        String choice;
        while(true)
        {
            myPrint(question);
            choice = scanner.nextLine();
            if (choice.isEmpty())
            {
                myPrint(choice + " is not a valid input. Try again");
            }
            else
            {
                break;
            }
        }

        return choice;

    }

    private static int makeChoiceNb(String question)
    {
        //Checks if input is a number
        int choice;
        while(true)
        {
            myPrint(question);
            String userInput = scanner.nextLine();
            try
            {
                choice = Integer.parseInt(userInput); 
                if (choice > 0)
                {
                    break;
                }
                else
                {
                    myPrint(userInput + " is not positive. Try again");
                }
            }
            catch(Exception e)
            {
                myPrint(userInput + " is not a number. Try again");
            }
        }

        return choice;
    }


    private static boolean checkChoice(String c)
    {
        boolean correctChoice = false;
        int choice;
        try
        {
            choice = Integer.parseInt(c);
        }
        catch(Exception e)
        {
            return correctChoice;
        }
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

    public static void myPrint(String s)
    {
        System.out.println(s);
    }
    public static void myPrint(double d)
    {
        System.out.println(d);
    }
}