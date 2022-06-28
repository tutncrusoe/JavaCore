import java.util.Scanner;

public class exercise_1 {

	public static void main(String[] args) {
		System.out.print("Nhap vao n = ");
		Scanner scan = new Scanner(System.in);
		float n = Float.parseFloat(scan.nextLine());
		float sum = recursion(n);
		System.out.println("Sum = " + sum);
		scan.close();
	}

	public static float recursion(float n) {
		if (n == 1) {
			return 0.5f;
		} else {
			return (float) (n) / (float) (n + 1) + recursion(n - 1);
		}
	}

}
