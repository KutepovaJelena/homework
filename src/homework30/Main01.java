package homework30;

public class Main01 {

  public static void main(String[] args) {

    int i = 15;//4 byte
    System.out.println(i + " ,celocislennyj tip dannyh, 4 byte");
    short s = 1;// 2 byte
    System.out.println(s + " ,korotkij tip dannyh, 2 byte ");
    long l = 10000L; // 8 byte
    System.out.println(l + " ,dlinnyj tip dannyh, 8 byte ");
    double d = 6.12;// 4 byte
    System.out.println(d + " ,dvojnoj tip dannyh,8 byte ");
    char c = 'c';// 2 byte
    System.out.println(c + " ,tip dannyh - simvol,1 byte");
    boolean b = true;// 1 byte
    System.out.println(b + " ,logicheskij tip dannyh,1 byte");
    float f = 54.5f;//4 byte
    System.out.println( f + " ,tip dannyh s plavajushej tochkoj, 4 byte");

  }

}
