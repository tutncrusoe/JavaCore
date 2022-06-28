import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		CongTy DanhSachCongTy = new CongTy();
		doMenu(DanhSachCongTy);
	}

	public static void inMenu() {
		System.out.println("1. Them Nhan vien.");
		System.out.println("2. Danh sach Nhan vien.");
		System.out.println("3. Tinh tong tien luong cua nhan vien.");
		System.out.println("4. Xuat nhan vien co luong cao nhat.");
		System.out.print("Select:");
	}

	public static void doMenu(CongTy DanhSachCongTy) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		do {
			inMenu();
			int select = Integer.parseInt(scan.nextLine());
			switch (select) {
			case 1:
				NhanVien nv = new NhanVien();
				nv.nhap(scan);
				DanhSachCongTy.addEmployees(nv);
				break;
			case 2:
				DanhSachCongTy.PrintEmployees();
				break;
			case 3:
				DanhSachCongTy.calculateSumSalaries();
				break;
			case 4:
				DanhSachCongTy.searchTheMostSalary();
				break;
			case 0:
				System.out.println("Chuong trinh ket thuc !");
				flag = false;
				break;
			}
		} while (flag);
		scan.close();
	}
}
