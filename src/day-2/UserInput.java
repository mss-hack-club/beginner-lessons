import java.util.Scanner;
public class UserInput {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("What's your age?");
    int age = input.nextInt();
    System.out.print("Your age is " + age);
  }
}
