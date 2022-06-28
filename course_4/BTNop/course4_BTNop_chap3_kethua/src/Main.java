import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		doMenu(scan);
	}

	public static void inMenu() {
		System.out.println();
		System.out.println("*****************************************");
		System.out.println("1. Them GiaoDichDat");
		System.out.println("2. Them GiaoDichNha");
		System.out.println("3. Xem DanhSachGiaoDich");
		System.out.println("4. Tong SoLuong GiaoDichNha & GiaoDichDat");
		System.out.println("5. Trung binh thanh tien GiaoDichDat");
		System.out.println("6. Xuat GiaoDich thang 9 nam 2013");
		System.out.println("0. Thoat");
		System.out.println("*****************************************");
	}

	public static void doMenu(Scanner scan) {
		boolean flag = true;
		DanhSachGiaoDich DSGD = new DanhSachGiaoDich();
		DSGD.dummyData();
		GiaoDich GD;
		do {
			inMenu();
			System.out.println("Select => ");
			int select = Integer.parseInt(scan.nextLine());
			switch (select) {
			case 1:
				GD = new GiaoDichDat();
				GD.nhap(scan);
				DSGD.them(GD);
				break;
			case 2:
				GD = new GiaoDichNha();
				GD.nhap(scan);
				DSGD.them(GD);
				break;
			case 3:
				DSGD.xuat();
				break;
			case 4:
				int num_Dat = DSGD.tinhTongGiaoDichDat();
				int num_Nha = DSGD.tinhTongGiaoDichNha();
				System.out.println("GiaoDichDat: " + num_Dat + "; GiaoDichNha: " + num_Nha);
				break;
			case 5:
				DSGD.tinhTongThanhTienGiaoDichDat();
				break;
			case 6:
				DSGD.xuatThang9_2013();
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}
}
