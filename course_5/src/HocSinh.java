import java.util.Scanner;

public class HocSinh extends ThanhVien {
	// 1. Attributes
	static int soHocSinh;
	private float diemToan;
	private float diemVan;
	private float diemNgoaiNgu;
	private float diemTrungBinh;
	private String xepLoai;

	// 2. Setter, Getter
	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	public float getDiemNgoaiNgu() {
		return diemNgoaiNgu;
	}

	public void setDiemNgoaiNgu(float diemNgoaiNgu) {
		this.diemNgoaiNgu = diemNgoaiNgu;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	// 3. Constructors
	{
		soHocSinh++;
	}

	public HocSinh() {

	}

	public HocSinh(int maThanhVien, String hoTen, int namSinh, String noiSinh, String diaChi, float diemToan,
			float diemVan, float diemNgoaiNgu) {
		super(maThanhVien, hoTen, namSinh, noiSinh, diaChi);
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemNgoaiNgu = diemNgoaiNgu;
	}

	// 4. In, Out methods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhập Điểm Toán: ");
		this.diemToan = Float.parseFloat(scan.nextLine());

		System.out.print("Nhập Điểm Văn: ");
		this.diemVan = Float.parseFloat(scan.nextLine());

		System.out.print("Nhập Điểm Ngoại Ngữ: ");
		this.diemNgoaiNgu = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\tĐiểm Toán: " + this.diemToan + "\tĐiểm Văn: " + this.diemVan + "\tĐiểm Ngoại Ngữ: "
				+ this.diemNgoaiNgu + "\tĐiểm Trung Bình: " + this.diemTrungBinh + "\tXếp Loại: " + this.xepLoai);
	}

	// 5. Business methods
	public void tinhDiemTrungBinh() {
		this.diemTrungBinh = ((this.diemToan + this.diemVan + this.diemNgoaiNgu) / 3);
		this.diemTrungBinh = (float) ((double) Math.round(this.diemTrungBinh * 10d) / 10d);
	}

	public void tinhXepLoai() {
		if (this.diemTrungBinh >= 9) {
			this.xepLoai = "Xuất Sắc";
		} else if (this.diemTrungBinh >= 8) {
			this.xepLoai = "Giỏi";
		} else if (this.diemTrungBinh >= 7) {
			this.xepLoai = "Khá";
		} else if (this.diemTrungBinh >= 6) {
			this.xepLoai = "TB-Khá";
		} else if (this.diemTrungBinh >= 5) {
			this.xepLoai = "Trung Bình";
		} else {
			this.xepLoai = "Yếu";
		}
	}
}
