import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /////// Part 1 ///////////

        // Create new ArrayList that contains Cupcake and call it cupcakeMenu
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        // Create new Cupcake object named cupcake
        Cupcake cupcake = new Cupcake();

        // Create new RedVelvet object
        RedVelvet redVelvet = new RedVelvet();

        // Create new Chocolate object
        Chocolate chocolate = new Chocolate();

        // Print "We are in the middle of creating the cupcake menu. We currently have three cupcakes on
        // the menu, but we need to decide on pricing"
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on" +
                "\nthe menu, but we need to decide on pricing");

        // Create a Scanner object named input, so we can accept the users input
        Scanner input = new Scanner(System.in);

        // Print "We are deciding on the price for our standard cupcake. Here is the description:"
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
        // Call the type() method on the cupcake object to get the description of the standard cupcake
        cupcake.type();

        // Print "How much would you like to charge for the cupcake?
        // (Input a numerical number taken to 2 decimal places)"
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        // Create a String variable named priceText and assign it the value of input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        String priceText = input.nextLine();

        // Create a double variable named price and set it equal to Double.parseDouble(priceText)
        double price = Double.parseDouble(priceText);

        // Now that we have the price, we can call the setPrice() method with the parameter of price on the cupcake object
        cupcake.setPrice(price);

        // Print "We are deciding on the price for our red velvet cupcake. Here is the description:"
        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");
        // Call the type() method on the redVelvet object to get the description of the red velvet cupcake
        redVelvet.type();

        // Print "How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)"
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        // Set the String variable named priceText equal to input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        priceText = input.nextLine();

        // Set the double variable named price equal to Double.parseDouble(priceText)
        price = Double.parseDouble(priceText);

        // Now that we have the price, we can call the setPrice() method with the parameter of price on the redVelvet object
        redVelvet.setPrice(price);

        // Print "We are deciding on the price for our chocolate cupcake. Here is the description:"
        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description: ");
        // Call the type() method on the chocolate object to get the description of the chocolate cupcake
        chocolate.type();

        // Print "How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)"
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        // Set the String variable named priceText equal to input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        priceText = input.nextLine();

        // Set the double variable named price equal to Double.parseDouble(priceText)
        price = Double.parseDouble(priceText);

        // Now that we have the price, we can call the setPrice() method with the parameter of price on the chocolate object
        chocolate.setPrice(price);

        // Add cupcake to cupcakeMenu
        cupcakeMenu.add(cupcake);

        // Add redVelvet to cupcakeMenu
        cupcakeMenu.add(redVelvet);

        // Add chocolate to cupcakeMenu
        cupcakeMenu.add(chocolate);

        /////// Part 2 ///////////



    }
}
// Create a new class named Cupcake. Others will inherit
class Cupcake
{
    // Create a public double variable named price. But do not assign it a value
    public double price;
    // Create a public function named getPrice that has no parameters and returns
    // the price
    public double getPrice() {
        return price;
    }
    // Create a public function name setPrice that has one
    // parameter, a double named price, and returns void.
    public void setPrice(double price) {
        this.price = price;
    }
    // Create a public function named type that prints a
    // description and returns void
    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}

// Create a new class named RedVelvet that extends from Cupcake
class RedVelvet extends Cupcake
{
    // Create a public function named type that returns
    // void and prints a description of the cupcake
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting");
    }
}

// Create new class named Chocolate that extends Cupcake
class Chocolate extends Cupcake
{
    // Create a public function name type that returns
    // void and prints a description of the cupcake
    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
}

// Create a new class Drink. All other drinks will inherit
