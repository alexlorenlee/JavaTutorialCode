public class TwoDimArrays {

	public static void main(String[] args) {

		int[][] lotteryCard = { { 20, 15, 7 }, { 8, 7, 19 }, { 7, 13, 41 } };

		int[][] lotteryCard2 = new int[3][3];
		lotteryCard2[0][0] = 20;
		lotteryCard2[0][1] = 15;
		lotteryCard2[0][2] = 7;
		lotteryCard2[1][0] = 8;
		lotteryCard2[1][1] = 7;
		lotteryCard2[1][2] = 19;
		lotteryCard2[2][0] = 7;
		lotteryCard2[2][1] = 13;
		lotteryCard2[2][1] = 41;

		// [row][column]
		System.out.println(lotteryCard[0][0]);

		System.out.println("---------");

		for (int i = 0; i <= 2; i++) {
			System.out.println(lotteryCard[i][i]);
		}

		System.out.println("---------");

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(lotteryCard[i][j]);
			}
		}

	}

}
