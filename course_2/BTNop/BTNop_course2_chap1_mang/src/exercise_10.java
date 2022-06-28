import java.util.Scanner;

public class exercise_10 {
	public static void main(String[] args) {

		System.out.print("Tao mang voi n phan tu: ");
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		System.out.print("Tao gia tri x = ");
		int x = Integer.parseInt(scan.nextLine());
		int[] a = taoMang(n);
		xuatMang(a);
		tinhTongCacGiaTriLonHonX(a, x);
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
		System.out.print("Mang a = ");
		for (int i : a) {
			System.out.print("\t" + i);
		}
		System.out.println("\n");
	}

	public static void tinhTongCacGiaTriLonHonX(int[] a, int x) {
		int sum = 0, count = 0;
		for (int i : a) {
			if (i > x) {
				System.out.println("Phan tu = " + i);
				sum += i;
				count++;
			}
		}
		System.out.println("Trung Binh Cong Cac So Lon Hon X = " + (float) sum / count);
	}
}
