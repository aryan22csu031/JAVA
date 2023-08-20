import java.util.Scanner;
class Vowel{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any character");
	String y = sc.next();
	System.out.println("Entered	" +y);
	if(y.length()==1){
	if (y.equals("a")||y.equals("e")||y.equals("i")||y.equals("o")||y.equals("u")||y.equals("A")||y.equals("E")||y.equals("I")||y.equals("O")||y.equals("U"))
	{
	System.out.println(" character is vowel");
	}
	else{
	System.out.println(" charcter is consonant");}
		}
		else{
			System.out.println("Please enter one character");
		}
	}
}
