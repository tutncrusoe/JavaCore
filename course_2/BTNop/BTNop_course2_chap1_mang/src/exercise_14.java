import java.util.Scanner;

public class exercise_14 {
	public static void main(String[] args) {

		System.out.print("Tao mang voi n phan tu: ");
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] a = taoMang(n);
		xuatMang(a, n);
		xoaSoChanTrongMang(a);
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

	public static void xoaSoChanTrongMang(int[] a) {
		int i, count;
		for (count = i = 0; i < a.length; i++) {
			if (checkPerfectSquare(a[i]) != true) {
				a[count] = a[i];
				count++;
			}
		}
		System.out.println("Length of new array: " + count);
		xuatMang(a, count);
	}
	
    public static boolean checkPerfectSquare(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
}
