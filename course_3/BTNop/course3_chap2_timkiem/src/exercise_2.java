import java.util.Scanner;

public class exercise_2 {

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
		int x = -1;
		int y = -1;
		System.out.print("Mang a = \t");
		for (int i = 0; i < a.length; i++) {
			System.out.print("\t" + a[i]);
			if (a[i] % 2 == 0 && y == -1) {
				x = a[i];
				y = i;
			}
		}
		System.out.println("\n");
		if (x == -1) {
			System.out.println("Mang khong co gia tri chan return " + x);
		} else {
			System.out.println("Phan tu chan dau tien trong mang = " + x + " tai vi tri " + y);
		}
	}
}