package homework26.task02;

public class Kettle {

  String model;
  String color;
  double capacity;
  int power;
  double cableLength;

  public Kettle(String model, String color, double capacity,
      double power, double cableLength) {
    this.model = model;
    this.color = color;
    this.capacity = capacity;
    this.power = (int) power;
    this.cableLength = cableLength;
  }
}


