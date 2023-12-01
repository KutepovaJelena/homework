package homework31;

import java.util.Random;
import java.util.Scanner;

public class Main02 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of dice to be rolled?");
    int nummer = scanner.nextInt();
    if (nummer == 1 || nummer == 2) {
      Random random = new Random();
      System.out.println("Result: ");
      int dice1 = random.nextInt(6) + 1;
      System.out.println(dice1);
      if (nummer == 2) {
        int dice2 = random.nextInt(6) + 1;
        System.out.println(dice2);
      }
    } else {
      System.out.println("I don't have that many dice to roll.");

    }
  }
}
