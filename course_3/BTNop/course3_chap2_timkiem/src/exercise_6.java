import java.util.Scanner;

public class exercise_6 {

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
		int x = 0;
		System.out.print("Mang a = \t");
		for (int i = 0; i < a.length; i++) {
			System.out.print("\t" + a[i]);
			if (Math.abs(a[i]) > x) {
				x = Math.abs(a[i]);
			}
		}
		System.out.println("\n");
		System.out.println("Phan tu nam trong doan [-" + x + "; " + x + "]");
	}

}
