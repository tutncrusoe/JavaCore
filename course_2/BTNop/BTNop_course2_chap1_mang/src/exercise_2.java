import java.util.Scanner;

public class exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap vao n = ");

		int n = Integer.parseInt(scan.nextLine());

		int[] a = nhapMang(n, scan);
		xuatMang(a);
		kiemtraMang(a);

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

	public static void xuatMang(int[] a) {
		System.out.print("Mang a = ");
		for (int k : a) {
			System.out.print("\t" + k);

		}
	}

	public static void kiemtraMang(int[] a) {
		for (int k = 1; k < a.length; k++) {
			if (a[k - 1] + 1 == a[k]) {
				System.out.print("\nCap so = " + a[k - 1] + ", " + a[k]);
			}
		}
	}
}
