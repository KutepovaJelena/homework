package homework26.task01;

public class Main01 {

  public static void main(String[] args) {
    Human nastya = new Human("Nastya",25,"cook");
    /* nastya.name = "Nastya";
    nastya.age = 25;
    nastya.occupation = "cook";*/

    Human vadim = new Human("Vadim", 27,"Developer");
    /*vadim.name = "Vadim";
    vadim.age = 27;
    vadim.occupation = "Developer";*/

    Human maria = new Human("Maria", 20, "Admin");
    /* maria.name = "Maria";
    maria.age = 20;
    maria.occupation = "Admin";*/

    nastya.introduce();
    vadim.introduce();
    maria.introduce();


  }

}
