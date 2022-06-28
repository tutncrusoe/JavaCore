import java.util.Scanner;

public class exercise_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Tao mang voi n phan tu: ");
		int n = Integer.parseInt(scan.nextLine());

		System.out.print("Nhap x = ");
		int x = Integer.parseInt(scan.nextLine());

		int[] a = taoMang(n);
		xuatMang(a);
		timGiaTriGanXNhat(a, x);
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
		System.out.print("Mang a = \t");
		for (int i = 0; i < a.length; i++) {
			System.out.print("\t" + a[i]);
		}
		System.out.println("\n");
	}

	public static void timGiaTriGanXNhat(int[] a, int x) {
		int min = Math.abs(x - a[0]), value = a[0];

		for (int i = 0; i < a.length; i++) {
			if (Math.abs(x - a[i]) < min) {
				value = a[i];
				min = Math.abs(x - a[i]);
			}
		}
		System.out.println("Gia tri " + value + " gan x = " + x);
	}
}
