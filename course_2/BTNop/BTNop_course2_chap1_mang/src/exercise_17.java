import java.util.Scanner;

public class exercise_17 {
	public static void main(String[] args) {

		System.out.print("Tao mang voi n phan tu: ");
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] a = taoMang(n);
		xuatMang(a, n);
		daoNguocMang(a);
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

	public static void xuatMang(int[] a, int n) {
		System.out.print("Mang a = ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}

	public static void daoNguocMang(int[] a) {
		int start, end = a.length - 1, temp;
		for (start = 0; start < end; start++) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			end--;
		}
		xuatMang(a, a.length);
	}
}
