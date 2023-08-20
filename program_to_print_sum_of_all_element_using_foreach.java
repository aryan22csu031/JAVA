import java.util.Scanner;
class Sumarrforeach {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        System.out.println("Sum of all elements in the array is "+sum);
    }
}
