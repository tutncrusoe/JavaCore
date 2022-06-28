import java.util.Scanner;

public class exercise_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Tao mang voi n phan tu: ");
		int n = Integer.parseInt(scan.nextLine());
		int[] a = taoMang(n);
		xuatMang(a);
		soChuSoLe(a);
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

	public static void soChuSoLe(int[] a) {
		int soLe = 0;
		System.out.println("Cac chu so le trong mang:");
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			int x = a[i];
			while (x / 10 != 0 || x % 10 != 0) { // Chia lay phan du %, chia lay phan nguyen /
				x = x / 10;
				count++;
			}
			if (count % 2 != 0) {
				System.out.println("a[" + i + "] = " + a[i]);
				soLe++;
			}
		}
	}
}