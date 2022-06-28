import java.util.Scanner;

public class exercise_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("Nhap n = ");
		int n = Integer.parseInt(scan.nextLine());

		tamgiaccan_dac(n);
		tamgiaccan_rong(n);

		scan.close();
	}

	public static void tamgiaccan_dac(int hight) {
		int k = 0;
		for (int i = 1; i <= hight; i++, k = 0) {
			for (int space = 1; space <= hight - i; space++) {
				System.out.print("  ");
			}
			while (k != 2 * i - 1) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
		}
	}

	public static void tamgiaccan_rong(int hight) {
		int k = 0;
		for (int i = 1; i <= hight; i++, k = 1) {
			for (int space = 1; space <= hight - i; space++) {
				System.out.print("  ");
			}
			if (i == 1) {
				while (k != 2 * i - 1) {
					System.out.print("* ");
					k++;
				}

			} else if (i != 1 && i != hight) {
				do {
					if (k == 1 || k == 2 * i - 1) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					k++;
				} while (k <= 2 * i - 1);

			} else if (i == hight) {
				while (k < 2 * i) {
					System.out.print("* ");
					k++;
				}
			}
			System.out.println();
		}
	}
}
