package homework26.task01;

public class Human {


  public String name;
  int age;
  public String occupation;

  public  Human(String name, int age, String occupation){
    this.name = name;
    this.age = age;
    this.occupation = occupation;
  }


  public void introduce() {
    System.out.println(
        " Hello, my name is " + name + " I am " + age + "years old , and I am " + occupation + "!");

  }

}
