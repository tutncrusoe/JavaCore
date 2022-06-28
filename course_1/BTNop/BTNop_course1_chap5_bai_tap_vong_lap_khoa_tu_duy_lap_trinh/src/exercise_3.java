import java.util.Scanner;

public class exercise_3 {

	public static void main(String[] args) {

		boolean flag = true;
		int tong = 0;
		String answer;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap vao n = ");
		int n = Integer.parseInt(scan.nextLine());
		
		do {
			System.out.print("Nhap vao so can tinh tong: ");
			int x = Integer.parseInt(scan.nextLine());
			
			if (x %2 != 0 && 0 < x && x < n || x == 1) {
				tong += x;
				System.out.print("Tong = " + tong);
				System.out.print("\nBan co muon tiep tuc ? (yes | no): ");
				answer = scan.nextLine();
				if (answer.equals("no")) {
					flag = false;
					break;
				} else {
					flag = true;
				}
				
			} else if (x %2 == 0 || x < 0) {
				System.out.print("Yeu cau nhap lai\n");
				flag = true;
			}
		}
		while (flag);
		scan.close();
		System.out.print("Chuong trinh ket thuc!");
	}
}
