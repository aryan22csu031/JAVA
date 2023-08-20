import java.util.Scanner;
class Sumalternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements of the array:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int count = 0;
        for(int element : arr) {
            if(count % 2 == 0) {
                sum += element;
            }
            count++;
        }
        
        System.out.println("The sum of alternate elements of the array is "+sum);
    }
}
