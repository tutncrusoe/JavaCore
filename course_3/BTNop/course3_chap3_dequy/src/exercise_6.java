import java.util.Scanner;

public class exercise_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Nhap vao x = ");
		float x = Float.parseFloat(scan.nextLine());
		System.out.print("Nhap vao n = ");
		float n = Float.parseFloat(scan.nextLine());

		float sum = sum(x, n);
		System.out.println("Sum = " + sum);
		scan.close();
	}

	public static float sum(float x, float n) {
		if (n == 1) {
			return x;
		} else {
			return (float) Math.pow(x, n) + sum(x, n - 1);
		}
	}
}