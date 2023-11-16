package homework26.task02;

public class Main01 {

  public static void printKettleInfo(Kettle kettle) {
    System.out.println("Model:" + kettle.model);
    System.out.println("Color: " + kettle.color);
    System.out.println("Capacity: " + kettle.capacity);
    System.out.println("Power(watt): " + kettle.power);
    System.out.println("CableLength ( m) " + kettle.cableLength);

  }

  public static void main(String[] args) {

    Kettle kettle = new Kettle("Clatronik",
        "silber", 1.7, 2600, 1.2);

    printKettleInfo(kettle);
  }

}
