import java.util.Scanner;

public class exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap vao n = ");
		int n = Integer.parseInt(scan.nextLine());
		
		scan.close();
		
		int giai_thua = 1;
		
		if (n == 0 || n == 1) {
			System.out.print("n! = " + giai_thua);
		} else {
			int i = 1;
			
			while (i <= n) {
				giai_thua *= i;
				i += 1;
			}
			System.out.print("n! = " + giai_thua);
		}
	}
}