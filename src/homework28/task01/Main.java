package homework28.task01;

public class Main {


    /*
    Вы повар в известном ресторане
    Главное блюдо ресторана - шикарные вареные яйца
    Вам нужно узнать, сколько времени займет варка яиц для всех текущих заказов
    Дано общее количество яиц
    Одно яйцо варится 5 минут (учесть что вода всегда кипит и в этих 5 минутах
    учтено время на то чтобы положить и достать яйца из воды.
    У вас всего одна кастрюла которая вмещает только 8 яиц

     public static int cookTime(int aggs) {
        return((eggs/8) + 1) * 5;
        }
        public static void main(String[] args) {
        System.out.println(cookTime(5));
        System.out.println(cookTime(10));
        system.out.println(cookTime(20));
        // resheniye.

     */

  public static void main(String[] args) {
    double[] arr = {4, 2, 7, 1, -5, 6};
    MyArray myArray = new MyArray(arr);

    myArray.set(myArray.indexOf(1), 10);
    myArray.add(myArray.indexOf(7), 123);
    myArray.remove(myArray.indexOf(7));
    System.out.println(myArray);
  }
}
