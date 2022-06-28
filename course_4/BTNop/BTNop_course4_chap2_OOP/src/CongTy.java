
public class CongTy {
	private QuanLyNhanVien QLNV;

	public CongTy() {
		this.QLNV = new QuanLyNhanVien();
	}

	public void addEmployees(NhanVien nv) {
		this.QLNV.addEmployees(nv);
	}

	public void PrintEmployees() {
		this.QLNV.PrintEmployees();
	}

	public void calculateSumSalaries() {
		this.QLNV.calculateSumSalaries();
	}

	public void searchTheMostSalary() {
		this.QLNV.searchTheMostSalary();
	}
}
