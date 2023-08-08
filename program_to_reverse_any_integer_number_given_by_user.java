import java.util.*;

class reversenum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to be reversed");
        int num = sc.nextInt();
       int count = 0;
       while(num >0){
           int rem = num %10;
           num /=10;
           count = count*10 + rem;
       }
        System.out.println(count);
    }
}
