import java.util.Scanner;

public class exercise_9 {
	public static void main(String[] args) {

		System.out.print("Tao mang voi n phan tu: ");
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] a = taoMang(n);
		xuatMang(a);
		tinhTrungBinhCongCacSoNguyenTo(a);
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

	public static void tinhTrungBinhCongCacSoNguyenTo(int[] a) {
		int sum = 0, count = 0;
		for (int i : a) {
			if (isPrimeNumber(i) == true) {
				System.out.println("So Nguyen To = " + i);
				sum += i;
				count++;
			}
		}
		System.out.println("Trung Binh Cong Cac So Nguyen To = " + (float) sum / count);
	}

	public static boolean isPrimeNumber(int n) {
		// so nguyen n < 2 khong phai la so nguyen to
		if (n < 2) {
			return false;
		}
		// check so nguyen to khi n >= 2
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
