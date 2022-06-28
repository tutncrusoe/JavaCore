import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {
	// 1. Attributes
	private String loaiDat;
	final float DAT_A = 1.5f;

	// 2. Setter, Getter
	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	// 3. Constructor
	public GiaoDichDat() {

	}

	public GiaoDichDat(int maGiaoDich, int ngayGiaoDich, int thangGiaoDich, int namGiaoDich, float donGia,
			float dienTich, String LoaiDat) {
		super(maGiaoDich, ngayGiaoDich, thangGiaoDich, namGiaoDich, donGia, dienTich);
		this.loaiDat = LoaiDat;
	}

	// 4. In, Out methods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhap LoaiDat(A|B|C): ");
		this.loaiDat = scan.nextLine();
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\tLoaiDat: " + this.loaiDat + "\tThanhTien: " + this.tinhThanhTien());
	}

	// 5. Business methods
	@Override
	public float tinhThanhTien() {
		super.tinhThanhTien();
		if (this.loaiDat.equals("A")) {
			this.thanhTien = this.dienTich * this.donGia * DAT_A;
		} else if (this.loaiDat.equals("B") || this.loaiDat.equals("C")) {
			this.thanhTien = this.dienTich * this.donGia;
		}
		return this.thanhTien;
	}
}
