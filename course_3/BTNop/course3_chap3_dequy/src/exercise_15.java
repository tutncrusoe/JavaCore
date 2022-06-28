import java.util.Scanner;

public class exercise_15 {

	public static void main(String[] args) {
		System.out.print("Nhap vao n = ");
		Scanner scan = new Scanner(System.in);
		float n = Float.parseFloat(scan.nextLine());
		float sum = sum(n);
		System.out.println("Sum = " + sum);
		scan.close();
	}

	public static float sum(float n) {
		if (n == 0) {
			return 1.0f;
		} else {
			return 1 / (float) (2 * n + 1) + sum(n - 1);
		}
	}
}