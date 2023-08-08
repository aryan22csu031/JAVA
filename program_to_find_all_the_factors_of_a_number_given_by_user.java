import java.util.*;
class findfact {

  public static void main(String[] args) {
    System.out.println("enter the number whose factors are to be find");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    System.out.print("Factors of " + number + " are: ");

    // loop runs from 1 to num
    for (int i = 1; i <= number; ++i) {

      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
