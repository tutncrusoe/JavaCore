import java.util.Scanner;

public class exercise_8 {
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
		int max = 4;
		int min = 2;

		for (int i = 0; i < n; i++) {
			a[i] = min + (int) (Math.random() * (max - min + 1));
		}
		return a;
	}

	public static void xuatMang(int[] a) {
		boolean flag = false;
		int x = -1, index = -1;
		System.out.print("Mang a = \t");
		for (int i = 0; i < a.length; i++) {
			System.out.print("\t" + a[i]);
			if (a[i] == Math.pow(2, i) && flag == false) {
				flag = true;
				x = a[i];
				index = i;
			}
		}
		System.out.println("\n");
		if (!flag) {
			System.out.println("Mang khong co gia tri 2^k return " + x);
		} else {
			System.out.println("Phan tu 2^k dau tien trong mang = " + x + " tai index = " + index);
		}
	}
}
