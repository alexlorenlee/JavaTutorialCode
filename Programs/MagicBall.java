import java.util.Random;
import java.util.Scanner;

public class MagicBall {

	public static void main(String[] args) {
		System.out.println("Enter your question");
		
		Scanner scan = new Scanner(System.in);
		scan.next();
		scan.close();
		
		Random rand = new Random();
		int r = rand.nextInt(5);
		System.out.println(r);
		
		if(r == 0) {
			System.out.println("As I see it, yes.");
		} else if(r == 1) {
			System.out.println("Signs point to yes.");
		} else if(r == 2) {
			System.out.println("Reply hazy, try again.");
		} else if(r == 3) {
			System.out.println("Don't count on it.");
		} else if(r == 4) {
			System.out.println("Outlook not so good.");
		}

		
	}

}
