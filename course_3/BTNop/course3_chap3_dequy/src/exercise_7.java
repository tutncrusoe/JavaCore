import java.util.Scanner;

public class exercise_7 {

	public static void main(String[] args) {
		System.out.print("Nhap vao n = ");
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		float sum = Sum(n);
		System.out.println("Sum = " + sum);
		scan.close();
	}

	public static float Sum(int n) {
		if (n == 1) {
			return 1.0f;
		} else {
			return (float) (1) / (float) (sum(n)) + Sum(n - 1);
		}
	}

	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}