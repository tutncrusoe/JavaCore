import java.util.Scanner;

public class GiaoDichNha extends GiaoDich {
	// 1. Attributes
	private String loaiNha;
	private String diaChi;
	final float LOAI_THUONG = 0.9f;

	// 2. Setter, Getter
	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	// 3. Constructors
	public GiaoDichNha() {

	}

	public GiaoDichNha(int maGiaoDich, int ngayGiaoDich, int thangGiaoDich, int namGiaoDich, float donGia,
			float dienTich, String LoaiNha, String DiaChi) {
		super(maGiaoDich, ngayGiaoDich, thangGiaoDich, namGiaoDich, donGia, dienTich);
		this.loaiNha = LoaiNha;
		this.diaChi = DiaChi;
	}

	// 4. In, Out methods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhap LoaiNha:");
		this.loaiNha = scan.nextLine();

		System.out.print("Nhap DiaChi:");
		this.diaChi = scan.nextLine();
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println(
				"\tLoaiNha: " + this.loaiNha + "\tDiaChi: " + this.diaChi + "\tThanhTien: " + this.tinhThanhTien());
	}

	// 5. Business methods
	@Override
	public float tinhThanhTien() {
		super.tinhThanhTien();
		if (this.loaiNha.equals("Cao Cap")) {
			this.thanhTien = this.dienTich * this.donGia;
		} else if (this.loaiNha.equals("Thuong")) {
			this.thanhTien = this.dienTich * this.donGia * LOAI_THUONG;
		}
		return this.thanhTien;
	}
}
