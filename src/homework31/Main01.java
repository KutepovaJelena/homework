package homework31;

import java.util.Scanner;

public class Main01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("vvedite chislo a: ");
    long a = scanner.nextLong();
    System.out.println(" vvedite chislo b : ");
    int b = scanner.nextInt();
    System.out.println(" vvedite chislo c: ");
    double c = scanner.nextDouble();
    System.out.println(" vvedite chislo d: ");
    short d = scanner.nextShort();

    double res =  (a * b) + (c * a) + c / d * c;

    System.out.println(res);
  }
}
