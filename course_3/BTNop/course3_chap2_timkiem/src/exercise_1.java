import java.util.Scanner;

public class exercise_1 {

	public static void main(String[] args) {
		System.out.print("Tao mang voi n phan tu: ");
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] a = taoMang(n);
		xuatMang(a);
		kiemTraMang(a);
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
		for (int k : a) {
			System.out.print("\t" + k);
		}
		System.out.println("\n");
	}

	public static void kiemTraMang(int[] a) {
		int min = a[0];
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				x = i;

			}
		}
		System.out.println("Phan tu nho nhat = " + min + " tai vi tri " + x);
	}
}
