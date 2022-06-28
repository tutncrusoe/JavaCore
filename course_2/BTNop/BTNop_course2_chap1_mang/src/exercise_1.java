import java.util.Scanner;

public class exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap n = ");

		int n = Integer.parseInt(scan.nextLine());
		int[] a = nhapMang(n, scan);

		xuatMang(a);
		kiemtraMang(a);
	}

	public static int[] nhapMang(int n, Scanner scan) {
		int[] a = new int[n];

		for (int k = 0; k < a.length; k++) {
			System.out.print("Nhap vao a[" + k + "] = ");
			a[k] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static void xuatMang(int[] a) {
		System.out.print("Mang a = \t");
		for (int k : a) {
			System.out.print("\t" + k);
		}
	}

	public static void kiemtraMang(int[] a) {
		boolean flag = true; // return 0
		for (int k = 0; k < a.length; k++) {
			if (a[k] == Math.pow(3, k)) {
				System.out.print("\nPhan tu 3^k: " + a[k]);
				if (flag == true) {
					flag = false;
				}
			}
		}
		if (flag == true) { // return 0
			System.out.print("\nMang khong co phan tu 3^k return 0");
		}
	}
}
