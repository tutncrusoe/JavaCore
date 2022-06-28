import java.util.Scanner;

public class exercise_9 {
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
		int max = -1, i = 0;
//		boolean flag = false;
		System.out.print("Mang a = \t");
		for (i = 0; i < a.length; i++) {
			System.out.print("\t" + a[i]);
			if (isPrimeNumber(a[i]) == true && max == -1) {
				max = a[i];
			} else if (isPrimeNumber(a[i]) == true && a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("\nMax prime number = " + max);

		if (max == -1) {
			System.out.println("Mang khong co so Nguyen to return " + max);
		} else {
			do {
				max++;
			} while (isPrimeNumber(max) == false);
			System.out.println("Phan tu soNguyenTo nho nhat lon hon moi gia tri trong mang = " + max);
		}
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
