package homework32;

import java.util.Scanner;

public class Main02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    for (int i = 1; i <= 10; i++) {
      int result = number * i;
      System.out.println(number + " * " + i + " = " + (number * i));
    }

  }

}
/*
import java.util.Scanner;

public class Main02_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (i * n));
        }
    }
}
 */