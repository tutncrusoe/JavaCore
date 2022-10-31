import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TruongHoc truongHoc = new TruongHoc();
		truongHoc.dummyData();
		doMenu(truongHoc);
	}

	public static void inMenu() {
		System.out.println("######################################################################");
		System.out.println("1. Thêm Giáo Viên.");
		System.out.println("2. Thêm Học Sinh.");
		System.out.println("3. Xem Danh Sách Quản Lý Thành Viên.");
		System.out.println("4. Xem Danh Sách Giáo Viên.");
		System.out.println("5. Xem Danh Sách Học Sinh.");
		System.out.println("6. Tìm Giáo Viên có thâm niên cao nhất.");
		System.out.println("7. Tìm Giáo Viên có thâm niên lớn hơn 5 năm và chuyên môn tự nhiên.");
		System.out.println("8. Tìm điểm Trung bình cao nhất của học sinh.");
		System.out.println("9. Tìm Học sinh có điểm trung bình cao nhất.");
		System.out.println("10. Sắp hết học sinh có điểm trung bình giảm dần - QuickSort.");
		System.out.println("11. Sắp xếp tên học sinh theo ABC - BubbleSort.");
		System.out.println("0. Thoát.");
		System.out.print("Select => ");
	}

	public static void doMenu(TruongHoc truongHoc) {
		boolean flag = true;
		float diemTrungBinhCaoNhat;
		Scanner scan = new Scanner(System.in);
		ThanhVien thanhVien;
		do {
			inMenu();
			int select = Integer.parseInt(scan.nextLine());
			System.out.println("######################################################################");
			switch (select) {
			case 0:
				System.out.println("Chương trình kết thúc!");
				flag = false;
				break;
			case 1:
				System.out.println("Đã tồn tại " + (int) (GiaoVien.soGiaoVien + HocSinh.soHocSinh) + " thành viên.");
				System.out.println("=> Thêm Giáo Viên");
				thanhVien = new GiaoVien();
				((GiaoVien) thanhVien).nhap(scan);
				((GiaoVien) thanhVien).tinhThamNien();
				truongHoc.themThanhVien(thanhVien);
				break;
			case 2:
				System.out.println("=> Thêm Học Sinh");
				thanhVien = new HocSinh();
				((HocSinh) thanhVien).nhap(scan);
				((HocSinh) thanhVien).tinhDiemTrungBinh();
				((HocSinh) thanhVien).tinhXepLoai();
				truongHoc.themThanhVien(thanhVien);
				break;
			case 3:
				System.out.println("Tổng số thành viên = " + (int) (GiaoVien.soGiaoVien + HocSinh.soHocSinh));
				truongHoc.xuat(0);
				break;
			case 4:
				System.out.println("Số Giáo Viên: " + GiaoVien.soGiaoVien);
				truongHoc.xuat(1);
				break;
			case 5:
				System.out.println("Số Học Sinh: " + HocSinh.soHocSinh);
				truongHoc.xuat(2);
				break;
			case 6:
				System.out.println("Tìm Giáo Viên có thâm niên cao nhất: ");
				truongHoc.timGiaoVienThamNienCaoNhat();
				break;
			case 7:
				System.out.println("Tìm Giáo Viên có thâm niên lớn hơn 5 năm và chuyên môn tự nhiên: ");
				truongHoc.timGiaoVienThamNienHon5NamTuNhien();
				break;
			case 8:
				System.out.println("Tìm điểm Trung bình cao nhất của học sinh: ");
				diemTrungBinhCaoNhat = truongHoc.diemTrungBinhCaoNhat();
				System.out.println("DiemTrungBinhCaoNhat: " + diemTrungBinhCaoNhat);
				break;
			case 9:
				System.out.println("Tìm Học sinh có điểm trung bình cao nhất: ");
				diemTrungBinhCaoNhat = truongHoc.diemTrungBinhCaoNhat();
				truongHoc.timHocSinhDiemTrungBinhCaoNhat(diemTrungBinhCaoNhat);
				break;
			case 10:
				System.out.println("Sắp hết học sinh có điểm trung bình giảm dần - QuickSort: ");
				truongHoc.quickSortDTBHSGiamDan();
				break;
			case 11:
				System.out.println("Sắp xếp tên học sinh theo ABC - BubbleSort: ");
				truongHoc.bubbleSortTenHocSinh();
				break;
			}
		} while (flag);
		scan.close();
	}
}
