import java.util.Scanner; // imported scanner class

public class Temperature {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // create link to input stream

    System.out.print("Input a degree in Fahrenheit: ");  // prompting the user to type in a temperature in fahrenheit
    double fahrenheit = input.nextDouble(); // get user's choice of degree

    double celsius = ((5 * (fahrenheit - 32.0)) / 9.0); // convert user's value into celsius
    System.out.println(fahrenheit + " degree(s) Fahrenheit is equal to " + celsius + " in Celsius"); // print the user's input in fahrenheit first and then converted value in celsius

  } // main method

} // main class
