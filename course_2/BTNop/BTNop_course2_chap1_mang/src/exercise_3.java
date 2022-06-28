import java.util.Scanner;

public class exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = -1;

//		do {
//			System.out.print("Nhap vao n chan = ");
//			n = Integer.parseInt(scan.nextLine());
//		} while (n % 2 != 0);

		while (n % 2 != 0) {
			System.out.print("Nhap vao n chan = ");
			n = Integer.parseInt(scan.nextLine());
		}

//		for (; n % 2 != 0 ;) {
//			System.out.print("Nhap vao n chan = ");
//			n = Integer.parseInt(scan.nextLine());
//		}

		int[] a = taoMang(n, scan);

		xuatMang(a);

		System.out.print("\nInput x = ");
		int x = Integer.parseInt(scan.nextLine());
		System.out.print("\nInput y = ");
		int y = Integer.parseInt(scan.nextLine());

		kiemtraMang(a, x, y);

		scan.close();
	}

	public static int[] taoMang(int n, Scanner scan) {
		System.out.print("Sinh so ngau nhien trong doan [-100; 100]\n");
		int[] a = new int[n];
		for (int k = 0; k < a.length; k++) {
			a[k] = -100 + (int) (Math.random() * ((100 - (-100)) + 1));
		}
		return a;
	}

	public static void xuatMang(int[] a) {
		for (int k : a) {
			System.out.print("\t" + k);

		}
	}

	public static void kiemtraMang(int[] a, int x, int y) {
		System.out.print("Cac phan tu chan trong mang:\n");
		for (int k : a) {
			if (Math.abs(k) % 2 == 0 && x <= k && k <= y) {
				System.out.print(k + "\t");
			}
		}
	}
}
