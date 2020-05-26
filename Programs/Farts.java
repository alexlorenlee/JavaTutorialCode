import java.util.HashMap;
import java.util.Scanner;

public class Farts {

	public static void main(String[] args) {
		
		System.out.println("Enter the first letter of your name and \n"
				+ "the day of the month you were born: ");
		
		Scanner scan = new Scanner(System.in);
		
		String letter = scan.next().toUpperCase();
		int day = scan.nextInt();
		
		HashMap<String, String> letters = new HashMap<String, String>();
		letters.put("A", "WRETCHED");
		letters.put("B", "DEEPLY");
		letters.put("C", "PHENOMENAL");
		letters.put("D", "GROSSLY");
		letters.put("E", "MONUMENTAL");
		letters.put("F", "EXPLOSIVE");
		letters.put("G", "UNEXPECTEDLY");
		letters.put("H", "THICK");
		letters.put("I", "TINY");
		letters.put("J", "LONG");
		letters.put("K", "GIGANTIC");
		letters.put("L", "TREMENDOUS");
		letters.put("M", "DANGEROUSLY");
		letters.put("N", "CRAZY");
		letters.put("O", "SCRAWNY");
		letters.put("P", "BEAUTIFLY");
		letters.put("Q", "ROTTENLY");
		letters.put("R", "SPOOKY");
		letters.put("S", "LUMPY");
		letters.put("T", "MODERATELY");
		letters.put("U", "HAPPY");
		letters.put("V", "TROUBLESOME");
		letters.put("W", "SAGGY");
		letters.put("X", "HEARTY");
		letters.put("Y", "BIG");
		letters.put("Z", "LUXURIOUS");
		
		HashMap<Integer, String> days = new HashMap<Integer, String>();
		days.put(1, "SOUR");
		days.put(2, "GREAT");
		days.put(3, "OLD");
		days.put(4, "LOUD");
		days.put(5, "LITTLE");
		days.put(6, "EPIC");
		days.put(7, "WET");
		days.put(8, "DANK");
		days.put(9, "FAKE");
		days.put(10, "SENILE");
		days.put(11, "MUSTY");
		days.put(12, "SHARP");
		days.put(13, "DANGEROUS");
		days.put(14, "MONOTONE");
		days.put(15, "SQUEAKY");
		days.put(16, "NOISELESS");
		days.put(17, "ROTTEN");
		days.put(18, "FAT");
		days.put(19, "SOFT");
		days.put(20, "POTENT");
		days.put(21, "SUDDEN");
		days.put(22, "POWERFUL");
		days.put(23, "STRANGE");
		days.put(24, "STURDY");
		days.put(25, "FLAT");
		days.put(26, "FULL");
		days.put(27, "WINDY");
		days.put(28, "HORRID");
		days.put(29, "BEAUTIFUL");
		days.put(30, "HOT");
		days.put(31, "SILENT");
		
		System.out.println("You are a " + letters.get(letter) + " "
				+ days.get(day) + " FART");
	}

}
