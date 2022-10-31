
public class TruongHoc {
	// 1. Attributes
	private QuanLyThanhVien qLTV;

	// 2. Setter, Getter
	public QuanLyThanhVien getqLTV() {
		return qLTV;
	}

	public void setqLTV(QuanLyThanhVien qLTV) {
		this.qLTV = qLTV;
	}

	// 3. Constructors
	public TruongHoc() {
		this.qLTV = new QuanLyThanhVien();
	}

	public TruongHoc(QuanLyThanhVien qLTV) {
		this.qLTV = qLTV;
	}

	// 4. In, Out methods
	public void xuat(int num) {
		this.qLTV.xuat(num);
	}

	// 5. Business methods
	public void themThanhVien(ThanhVien thanhVien) {
		this.qLTV.addThanhVien(thanhVien);
	}

	public void dummyData() {
		this.qLTV.dummyData();
	}

	public void timGiaoVienThamNienCaoNhat() {
		this.qLTV.timGiaoVienThamNienCaoNhat();
	}

	public void timGiaoVienThamNienHon5NamTuNhien() {
		this.qLTV.timGiaoVienThamNienHon5NamTuNhien();
	}

	public float diemTrungBinhCaoNhat() {
		return this.qLTV.diemTrungBinhCaoNhat();
	}

	public void timHocSinhDiemTrungBinhCaoNhat(float diem) {
		this.qLTV.timHocSinhDiemTrungBinhCaoNhat(diem);
	}

	public void quickSortDTBHSGiamDan() {
		this.qLTV.quickSortDTBHSGiamDan();
	}
	
	public void bubbleSortTenHocSinh() {
		this.qLTV.bubbleSortTenHocSinh();
	}
}
