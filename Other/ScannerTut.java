import java.util.Scanner;

public class ScannerTut {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's your first name?");
		String name = scan.next();
		
		System.out.println("What's your age?");
		int age = scan.nextInt();
		
		System.out.println("What's your senior quote?");
		String quote = scan.next();
		quote += scan.nextLine();
		
		System.out.println("Thank you " + name + ", you are " + age + " years old");
		System.out.println("and your senior quote is " + quote);
		
	}

}
