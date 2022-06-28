import java.util.Scanner;

public class exercise_1 {

	public static void main(String[] args) {
		System.out.print("Tao mang hai chieu\nNumber of row: ");
		Scanner scan = new Scanner(System.in);
		int row = Integer.parseInt(scan.nextLine());
		System.out.print("Number of columm: ");
		int col = Integer.parseInt(scan.nextLine());
		int[][] a = taoMang(row, col);
		xuatMang(a, row, col);
		
		scan.close();
	}

	public static int[][] taoMang(int row, int col) {
		int max = 50;
		int min = -50;
		int[][] a = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = min + (int)(Math.random() * (max - min + 1));
			}
		}
		return a;
	}

	public static void xuatMang(int[][] a, int row, int col) {
		boolean flag = false;
		int x = -1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + "\t");
				if (a[i][j] % 2 == 0 && flag == false) {
					x = a[i][j];
					flag = true;
				}
			}
			System.out.println("\t");
		}
		if (flag) {
			System.out.println("So chan dau tien trong mang = " + x);
		}
	}
}
