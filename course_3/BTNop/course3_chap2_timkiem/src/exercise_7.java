import java.util.Scanner;

public class exercise_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Tao mang voi n phan tu: ");
		int n = Integer.parseInt(scan.nextLine());

		System.out.print("Nhap x = ");
		int x = Integer.parseInt(scan.nextLine());

		System.out.print("Nhap y = ");
		int y = Integer.parseInt(scan.nextLine());

		int[] a = taoMang(n);
		xuatMang(a, x, y);
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

	public static void xuatMang(int[] a, int x, int y) {
		int i, num = -1;
		boolean flag = false;
		System.out.print("Mang a =");
		for (i = 0; i < a.length; i++) {
			System.out.print("\t" + a[i]);
			if (x < a[i] && a[i] < y && flag == false) {
				num = a[i];
				flag = true;
			}
		}
		System.out.println();
		if (flag == false) {
			System.out.println("Khong ton tai phan tu trong doan [" + x + "; " + y + "] return " + num);
		} else {
			System.out.println("Phan tu dau tien trong doan [" + x + "; " + y + "] la`: " + num);
		}
	}
}
