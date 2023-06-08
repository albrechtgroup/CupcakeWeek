import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Order
{
    // Create a public constructor function named Order
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu)
    {
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");

        // Create a Scanner object named input to accept users input
        Scanner input = new Scanner(System.in);

        // Create a String object named placeOrder and set
        // it equal to the user input
        String placeOrder = input.nextLine();

        // Create an ArrayList that contains Objects
        ArrayList<Object> order = new ArrayList<Object>();

        // Create an if statement that checks if placeOrder
        // equals Y ignoring capitalization
        if (placeOrder.equalsIgnoreCase("Y"))
        {
            // Add LocalDate.now() to order
            order.add(LocalDate.now());

            //Add LocalTime.now() to order
            order.add(LocalTime.now());

            //Print "Here is the menu"
            System.out.println("Here is the menu");

            //Print "CUPCAKES:"
            System.out.println("CUPCAKES:");

            //Create an int variable named itemNumber and set it equal to 0
            int itemNumber = 0;

            // Create a for loop that iterates through each index of cupcakeMenu
            for (int i = 0; i < cupcakeMenu.size(); i++)
            {
                // Increment itemNumber by one
                itemNumber++;

                // Print itemNumber.
                System.out.print(itemNumber + ".");

                // Print a description of the cupcake at cupcakeMenu at index i
                cupcakeMenu.get(i).type();

                System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());

                // Print a new line
                System.out.println();
            }

            System.out.println("DRINKS:");

            // Create a for loop that iterates through each index of drinkMenu
            for (int i = 0; i < drinkMenu.size(); i++)
            {
                // increment itemNumber by one
                itemNumber++;

                System.out.print(itemNumber + ".");

                // Print a description of the drink at drinkMenu at index i
                drinkMenu.get(i).type();

                System.out.println("Price: $" + drinkMenu.get(i).getPrice());

                // Print a new line
                System.out.println();
            }

            // Create a boolean variable named ordering and set it equal to true
            boolean ordering = true;

            // Create a while loop that continues as long as ordering equals true
            while (ordering)
            {
                // Print "What would you like to order? Please use the number associated with each item to order"
                System.out.println("What would you like to order? Please use the number associated with each item to order");

                // Create an int named orderChoice and set it equal to what the user inputs
                int orderChoice = input.nextInt();

                // Correct the terminal scanner input location
                input.nextLine();

                // Create an if statement that checks if orderChoice equals 1
                if (orderChoice == 1)
                {
                    // Add the first item from the cupcakeMenu array to the order array
                    order.add(cupcakeMenu.get(0));

                    System.out.println("Item added to order");
                }
                // Create an else if statement that checks if orderChoice equals 2
                else if (orderChoice == 2)
                {
                    // Add the second item from the cupcakeMenu array to the order array
                    order.add(cupcakeMenu.get(1));

                    System.out.println("Item added to order");
                }
                // Create an else if statement that checks if orderChoice equals 3
                else if (orderChoice == 3)
                {
                    // Add the third item from the cupcakeMenu array to the order array
                    order.add(cupcakeMenu.get(2));

                    System.out.println("Item added to order");
                }
                // Create an else if statement that checks if orderChoice equals 4
                else if (orderChoice == 4)
                {
                    // Add the first item from the drinkMenu array to the order array
                    order.add(drinkMenu.get(0));

                    System.out.println("Item added to order");
                }
                // Create an else if statement that checks if orderChoice equals 5
                else if (orderChoice == 5)
                {
                    // Add the second item from the drinkMenu array to the order array
                    order.add(drinkMenu.get(1));

                    System.out.println("Item added to order");
                }
                // Create an else if statement that checks if orderChoice equals 6
                else if (orderChoice == 6)
                {
                    // Add the third item from the drinkMenu array to the order array
                    order.add(drinkMenu.get(2));

                    System.out.println("Item added to order");
                }
                // Create an else statement with no parameters
                else
                {
                    System.out.println("Sorry, we don't seem to have that on the menu");
                }

                //Print "Would you like to continue ordering? (Y/N)"
                System.out.println("Would you like to continue ordering? (Y/N)");

                //Create a String object named continueOrder and set it equal to the user iput
                String continueOrder = input.nextLine();

                //Create an if statement that checks if continueOrder does NOT equal Y ignoring capitalization
                if (!continueOrder.equalsIgnoreCase("Y"))
                {
                    // Set ordering equal to false
                    ordering = false;
                }
            }

            // Cupcake week part 4

        }
        else
        {
            System.out.println("Have a nice day then");
        }

    }
}
