public class Objective4Lab3 {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("How old are you?");
    int age= input.nextInt();
    int currentYear= 2022;
    int birthYear= (currentYear - age);
    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
