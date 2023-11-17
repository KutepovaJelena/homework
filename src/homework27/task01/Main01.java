package homework27.task01;


public class Main01 {

  public static void main(String[] args) {
    Human nastya = new Human("Nastya", 27, "cook");
    /* nastya.name = "Nastya";
    nastya.age = 25;
    nastya.occupation = "cook";*/
    nastya.introduce();
    nastya.setAge(30);
    nastya.setOccupation("Admin");
    nastya.introduce();

    Human vadim = new Human("Vadim", 25, "Developer");
    /*vadim.name = "Vadim";
    vadim.age = 27;
    vadim.occupation = "Developer";*/
    vadim.introduce();
    vadim.setAge(31);
    vadim.setOccupation("Jobless");
    vadim.introduce();

    Human maria = new Human("Maria", 25, "Admin");
    /* maria.name = "Maria";
    maria.age = 20;
    maria.occupation = "Admin";*/
    maria.introduce();
    maria.setAge(27);
    maria.setOccupation("Manager");
    maria.introduce();
  }

}
