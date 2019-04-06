import java.util.ArrayList;
import java.util.Scanner;

public class WhileDo {

	public static void main(String[] args) {

		String sentence = "flapjacks are awesome!";
		Scanner scan = new Scanner(sentence);
		ArrayList words = new ArrayList();

		while (scan.hasNext()) {
			words.add(scan.next());
		}

		System.out.println(words);

	}

}
