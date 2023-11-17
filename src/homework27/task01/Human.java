package homework27.task01;

public class Human {


  private String name;
  private int age;
  private String occupation;

  public Human(String name, int age, String occupation) {
    this.name = name;
    this.age = age;
    this.occupation = occupation;
  }

  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public String getOccupation() {
    return occupation;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }

  public void introduce() {
    System.out.println(
        " Hello, my name is " + name + " I am " + age + " years old , and I am " + occupation + "!");

  }

}
