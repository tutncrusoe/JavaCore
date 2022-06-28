import java.util.Scanner;

public class exercise_5 {
	public static void main(String[] args) {

		System.out.print("Tao mang voi n phan tu: ");
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] a = taoMang(n);
		xuatMang(a);
		suSoDauTienChan(a);
		scan.close();
	}

	public static int[] taoMang(int n) {
		int[] a = new int[n];
		int max = 1000;
		int min = -1000;

		for (int i = 0; i < n; i++) {
			a[i] = min + (int) (Math.random() * (max - min + 1));
		}
		return a;
	}

	public static void xuatMang(int[] a) {
		System.out.print("Mang a = ");
		for (int i : a) {
			System.out.print("\t" + i);
		}
		System.out.println("\n");
	}

	public static void suSoDauTienChan(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			while (x / 10 != 0 || x % 10 != 0) {
				System.out.println("x = " + x);
				x = x / 10;
			}
			if (x % 2 == 0) {
				System.out.println("a[" + i + "]" + a[i]);
			}
		}
	}
}
