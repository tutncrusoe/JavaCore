import java.util.Scanner;

public class exercise_6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("So tien gui = ");
		float so_tien_gui = Float.parseFloat(scan.nextLine());
		System.out.print("So tien muon nhan = ");
		float so_tien_muon_nhan = Float.parseFloat(scan.nextLine());
		System.out.print("Lai suat tiet kiem %: ");
		float lai_suat = Float.parseFloat(scan.nextLine());
		scan.close();

		float tien_lai = so_tien_gui * (lai_suat/100);
		System.out.print("Tien lai nhan duoc moi nam = "+ tien_lai);
		float sum = so_tien_gui;
		int nam = 0;
		
		do {
			sum += tien_lai;
			nam += 1;
		} while (sum < so_tien_muon_nhan);
		System.out.print("\nSo nam phai gui tiet kiem: "+ nam);
	}

}
