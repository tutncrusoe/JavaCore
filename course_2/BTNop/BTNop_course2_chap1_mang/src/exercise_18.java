import java.util.Scanner;
.
public class exercise_18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap vao n = ");

		int n = Integer.parseInt(scan.nextLine());

		int[] a = nhapMang(n, scan);
		xuatMang(a, n);
		timPhanTuXuatHienNhieuNhat(a);

		scan.close();
	}

	public static int[] nhapMang(int n, Scanner scan) {
		int[] a = new int[n];
		for (int k = 0; k < a.length; k++) {
			System.out.print("Nhap a[" + k + "] = ");
			a[k] = Integer.parseInt(scan.nextLine());

		}
		return a;
	}

	public static void xuatMang(int[] a, int n) {
		System.out.print("Mang a = ");
		for (int k : a) {
			System.out.print("\t" + k);
		}
		System.out.println();
	}

	public static void timPhanTuXuatHienNhieuNhat(int[] a) {
		int diff, i, j;
		for (diff = i = 1; i < a.length; i++) {
			for (j = 0; j < i; j++) {
				if (a[j] != a[i]) {
					a[diff] = a[j];
					diff++;
				}
			}
		}
		xuatMang(a, diff);
	}
}
