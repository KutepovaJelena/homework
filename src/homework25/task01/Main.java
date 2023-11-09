package homework25.task01;

import homework25.task01.Human;

public class Main {

  public static void main(String[] args) {
    Human nastya = new Human();
    nastya.name = " Nastya";
    nastya.age = 25;
    nastya.occupation = "cook";

    Human vadim = new Human();
    vadim.name = "Vadim";
    vadim.age = 27;
    vadim.occupation = "Developer";

    Human maria = new Human();
    maria.name = "Maria";
    maria.age = 20;
    maria.occupation = "Admin";

    nastya.introduce();
    vadim.introduce();
    maria.introduce();

  }

}
