package homework32;

import java.util.Scanner;

public class Main04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[scanner.nextInt()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {
        System.out.println("Massiv ne otsortirovan.");
        return;
      }
    }
    System.out.println("Massiv otsortirovan.");
  }
}