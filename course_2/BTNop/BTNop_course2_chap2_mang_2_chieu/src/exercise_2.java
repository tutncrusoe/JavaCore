import java.util.Scanner;

public class exercise_2 {

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
		int sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + "\t");
				if (a[i][j] % 2 == 0) {
					sum += a[i][j];
				}
			}
			System.out.println("\t");
		}
		System.out.println("Tong cac so chan trong mang = " + sum);
	}
}
