import java.util.Scanner;
public class MyClass{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input your name");
    String name = sc.nextLine();
    System.out.println("Hello " + name);
  }
}
