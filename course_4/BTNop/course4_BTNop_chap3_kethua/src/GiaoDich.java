import java.util.Scanner;

/*
 * Mục đích: Tạo lớp superclass để lưu trữ và xử lý liên quan đến Giao Dịch
 */
public class GiaoDich {
	// 1. Attributes
	protected int maGiaoDich;
	protected int ngayGiaoDich;
	protected int thangGiaoDich;
	protected int namGiaoDich;
	protected float donGia;
	protected String loaiDat;
	protected float dienTich;
	protected float thanhTien;

	// 2. Setter, Getter
	public int getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public int getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(int ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public int getThangGiaoDich() {
		return thangGiaoDich;
	}

	public void setThangGiaoDich(int thangGiaoDich) {
		this.thangGiaoDich = thangGiaoDich;
	}

	public int getNamGiaoDich() {
		return namGiaoDich;
	}

	public void setNamGiaoDich(int namGiaoDich) {
		this.namGiaoDich = namGiaoDich;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	public float getDienTich() {
		return dienTich;
	}

	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	// 3. Constructor
	public GiaoDich() {

	}

	public GiaoDich(int maGiaoDich, int ngayGiaoDich, int thangGiaoDich, int namGiaoDich, float donGia,
			float dienTich) {
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.thangGiaoDich = thangGiaoDich;
		this.namGiaoDich = namGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}

	// 4. In, Out Methods
	public void nhap(Scanner scan) {
		System.out.print("Nhap MaGiaoDich: ");
		this.maGiaoDich = Integer.parseInt(scan.nextLine());

		System.out.print("Nhap NgayGiaoDich: ");
		this.ngayGiaoDich = Integer.parseInt(scan.nextLine());
		System.out.print("Nhap ThangGiaoDich: ");
		this.thangGiaoDich = Integer.parseInt(scan.nextLine());
		System.out.print("Nhap NamGiaoDich: ");
		this.namGiaoDich = Integer.parseInt(scan.nextLine());

		System.out.print("Nhap DonGia: ");
		this.donGia = Integer.parseInt(scan.nextLine());

		System.out.print("Nhap DienTich: ");
		this.dienTich = Integer.parseInt(scan.nextLine());

	}

	public void xuat() {
		System.out.println("Ma: " + this.maGiaoDich + "\tNgay: " + this.ngayGiaoDich + "/" + this.thangGiaoDich + "/"
				+ this.namGiaoDich + "\tDonGia: " + this.donGia + "\tDienTich: " + this.dienTich);
	}

	// 5. Business methods
	public float tinhThanhTien() {
		return this.thanhTien;
	}
}
