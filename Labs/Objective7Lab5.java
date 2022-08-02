public class Objective7Lab5 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();
      if (selection == 1) {
        System.out.println("Hello Human");
      }
      if (selection == 2) {
        System.out.println("Chips, Brains, Apples");
      }
      if (selection ==3) {
        System.out.println("Goodbye Human");
        break;
      }
    }
    scanner.close();
  }
}
