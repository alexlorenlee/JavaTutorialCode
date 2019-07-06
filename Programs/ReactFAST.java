import java.util.Scanner;

public class ReactFAST {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		
		System.out.println("GO!!!!!!!!!");
		long startTime = System.currentTimeMillis();
		
		Scanner s = new Scanner(System.in);
		s.next();
		long stopTime = System.currentTimeMillis();
		
		long reactionTime = stopTime - startTime;
		
		System.out.println(reactionTime + "ms");
		
	}

}
