import java.util.Scanner;

public class exercise_3 {

	public static void main(String[] args) {
		System.out.print("Tao mang voi n phan tu: ");
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] a = taoMang(n);
		xuatMang(a);
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
		int start = -1;
		int min = -1;
		System.out.print("Mang a = ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("\t" + a[i]);
			if (a[i] >= 0) {
				start = a[i];
//				System.out.println(start);
				if (min == -1) {
					min = start;
				} else if (start < min) {
					min = start;
				}

			}
		}
		System.out.println("\n");
		if (min < 0) {
			System.out.println("Mang khong co gia tri duong return -1");
		} else {
			System.out.println("Phan tu duong nho nhat trong mang = " + min);
		}
	}

}
