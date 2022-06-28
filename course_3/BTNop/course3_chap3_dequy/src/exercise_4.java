import java.util.Scanner;

public class exercise_4 {

	public static void main(String[] args) {
		System.out.print("Nhap vao n = ");
		Scanner scan = new Scanner(System.in);
		float n = Float.parseFloat(scan.nextLine());
		float sum = sum(n);
		System.out.println("Sum = " + sum);
		scan.close();
	}

	public static float sum(float n) {
		if (n == 1) {
			return 0.5f;
		} else {
			return 1 / (float) (2 * n) + sum(n - 1);
		}
	}
}