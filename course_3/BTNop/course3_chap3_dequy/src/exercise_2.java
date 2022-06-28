import java.util.Scanner;

public class exercise_2 {

	public static void main(String[] args) {
		System.out.print("Nhap vao n = ");
		Scanner scan = new Scanner(System.in);
		float n = Float.parseFloat(scan.nextLine());
		float sum = sqrt(n);
		System.out.println("Sum = " + sum);
		scan.close();
	}

	public static float sqrt(float n) {
		if (n == 1) {
			return (float) Math.sqrt(1);
		} else {
			return (float) Math.sqrt(n + sqrt(n-1));
		}
	}
}
