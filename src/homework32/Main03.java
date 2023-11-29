package homework32;

import java.util.Scanner;

public class Main03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number;
    do {
      System.out.println("Pleas enter nummer from 1 to 10: ");
      number = scanner.nextInt();
      if (number >= 1 && number <= 10) {
        System.out.println("You enter " + number + "." + " Thank you.");
        break;
      } else {
        System.out.println("Not correct number.");
      }
    }while (true);
  }
}
