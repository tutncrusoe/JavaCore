import java.util.ArrayList;

public class QuanLyNhanVien {
	private ArrayList<NhanVien> QLNV;

	// Setter and Getter
	public ArrayList<NhanVien> getQLNV() {
		return QLNV;
	}

	public void setQLNV(ArrayList<NhanVien> QLNV) {
		this.QLNV = QLNV;
	}

	// Constructor
	public QuanLyNhanVien() {
		this.QLNV = new ArrayList<NhanVien>();
	}

	// In, out methods
	public void addEmployees(NhanVien nv) {
//		nv.nhap();
		this.QLNV.add(nv);
	}

	public void PrintEmployees() {
		if (this.QLNV.size() > 0) {
			for (NhanVien nv : this.QLNV) {
				nv.xuat();
			}
		} else {
			System.out.println("Chua ton tai nhan vien nao !");
		}
	}

	public void calculateSumSalaries() {
		if (this.QLNV.size() > 0) {
			float sum_salary = 0;
			for (NhanVien nv : QLNV) {
				sum_salary += nv.tinhLuongNhanVien();
			}
			System.out.println("Tong luong nhan vien = " + sum_salary);
		} else {
			System.out.println("Chua ton tai nhan vien nao !");
		}
	}

	public void printList(ArrayList<NhanVien> list) {
		for (NhanVien nv : list ) {
			nv.xuat();
		}
	}
	public void searchTheMostSalary() {
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		int most = -1;
		if (this.QLNV.size() > 0) {
			NhanVien nv_most_salary = this.QLNV.get(0);
			for (int i = 0; i < this.QLNV.size(); i++) {
				if (this.QLNV.get(i).tinhLuongNhanVien() > nv_most_salary.tinhLuongNhanVien()) {
					nv_most_salary = this.QLNV.get(i);
					list.add(this.QLNV.get(i));
					most = i;
				}
			}
			for (int i = most + 1; i < this.QLNV.size(); i++) {
				if (this.QLNV.get(i).tinhLuongNhanVien() == nv_most_salary.tinhLuongNhanVien()) {
					list.add(this.QLNV.get(i));
				}
			}
			printList(list);
		} else {
			System.out.println("Chua ton tai nhan vien nao !");
		}
	}
}