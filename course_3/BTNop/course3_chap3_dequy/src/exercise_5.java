import java.util.Scanner;

public class exercise_5 {

	public static void main(String[] args) {
		System.out.print("Nhap vao n = ");
		Scanner scan = new Scanner(System.in);
		float n = Float.parseFloat(scan.nextLine());
		float sum = sum(n);
		System.out.println("Sum = " + sum);
		scan.close();
	}

	public static float sum(float n) {
		if (n == 2) {
			return 0.5f;
		} else {
			return 1 / (float) (n*(n-1)) + sum(n - 1);
		}
	}
}