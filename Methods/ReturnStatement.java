public class ReturnStatement {

	public static void main(String[] args) {
		String shouting = caps("why are you reading my diary mom?!");
		System.out.println(shouting);

		int[] awesomeArray = gimmeArrayFromInts(3, 7, 1);
		System.out.println(awesomeArray[0]);
		System.out.println(awesomeArray[1]);
		System.out.println(awesomeArray[2]);
	}

	public static String caps(String s) {
		return s.toUpperCase();
	}

	public static int[] gimmeArrayFromInts(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}

}