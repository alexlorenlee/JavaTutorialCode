public class StringMethods {

	public static void main(String[] args) {

		String name = "Billy Bob Joe";

		System.out.println("Normal: " + name);
		System.out.println("To uppercase: " + name.toUpperCase());
		System.out.println("To lowercase: " + name.toLowerCase());
		System.out.println("First character: " + name.charAt(0));
		System.out.println("Length: " + name.length());
		System.out.println("Last character: " + name.charAt(12));
		System.out.println("Last name: " + name.substring(10, 13));

	}

}