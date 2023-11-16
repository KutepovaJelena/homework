package homework25.task02;

import homework25.task02.Pen;

public class Main02 {

  public static void main(String[] args) {
    Pen pen = new Pen();
    pen.checkInk();
    pen.write("Hello, I am writing thith this pen");
    pen.checkInk();
    pen.write("And now I am gonna refill it");
    pen.refill();
    pen.checkInk();
  }

}

