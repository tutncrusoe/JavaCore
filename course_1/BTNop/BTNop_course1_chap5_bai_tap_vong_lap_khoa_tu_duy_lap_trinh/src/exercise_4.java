import java.util.Scanner;

public class exercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap vao n = ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.print("Nhap vao x = ");
		float x = Float.parseFloat(scan.nextLine());
		
		scan.close();

		float S = ham_mu(x, n);
		System.out.print("S(n) = " + S);
	}

	public static float ham_mu(float x, int n) {
		int i, j;

		float sum = 0;
		for (i = 1; i <= n; i++) {
			float ham_mu = 1;
			for (j = 1; j <= i; j++) {
				ham_mu = ham_mu * x;
			}
			sum += ham_mu;
		}
		return sum;
	}
}
