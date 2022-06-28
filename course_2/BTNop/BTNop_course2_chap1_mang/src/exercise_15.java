import java.util.Scanner;

public class exercise_15 {
	public static void main(String[] args) {

		System.out.print("Tao mang voi n phan tu: ");
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		System.out.print("So lan can dich mang: ");
		int x = Integer.parseInt(scan.nextLine());
		int[] a = taoMang(n);
		xuatMang(a, n);
		dichMang(a, x);
		scan.close();
	}

	public static int[] taoMang(int n) {
		int[] a = new int[n];
		int max = 20;
		int min = 0;

		for (int i = 0; i < n; i++) {
			a[i] = min + (int) (Math.random() * (max - min + 1));
		}
		return a;
	}

	public static void xuatMang(int[] a, int n) {
		System.out.print("Mang a = ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}

	public static void dichMang(int[] a, int x) {
		int last, i, j;
		for (i = 0; i < x; i++) {
			last = a[a.length - 1];
//			System.out.println("last = " + last);
			for (j = a.length - 1; j > 0; j--) {
//				System.out.println(a[j]);
				a[j] = a[j - 1];
			}
			a[0] = last;
		}
		xuatMang(a, a.length);
	}
}
