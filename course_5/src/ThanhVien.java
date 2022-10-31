import java.util.Scanner;

public class ThanhVien {
	// 1. Attributes
	protected int maThanhVien;
	protected String hoTen;
	protected int namSinh;
	protected String noiSinh;
	protected String diaChi;

	// 2. Setter, Getter
	public int getMaThanhVien() {
		return maThanhVien;
	}

	public void setMaThanhVien(int maThanhVien) {
		this.maThanhVien = maThanhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	// 3. Constructor
	public ThanhVien() {

	}

	public ThanhVien(int maThanhVien, String hoTen, int namSinh, String noiSinh, String diaChi) {
		this.maThanhVien = maThanhVien;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.noiSinh = noiSinh;
		this.diaChi = diaChi;
	}

	// 4. In, Out methods
	public void nhap(Scanner scan) {
		System.out.print("Nhập mã Thành Viên: ");
		this.maThanhVien = Integer.parseInt(scan.nextLine());

		System.out.print("Nhập Tên: ");
		this.hoTen = scan.nextLine();

		System.out.print("Nhập Năm Sinh: ");
		this.namSinh = Integer.parseInt(scan.nextLine());

		System.out.print("Nhập Nơi Sinh: ");
		this.noiSinh = scan.nextLine();

		System.out.print("Nhập Địa Chỉ: ");
		this.diaChi = scan.nextLine();
	}

	public void xuat() {
		System.out.print("Mã Thành Viên: " + this.maThanhVien + "\tTên: " + this.hoTen + "\tNăm Sinh: " + this.namSinh
				+ "\tNơi Sinh: " + this.noiSinh + "\tĐịa Chỉ: " + this.diaChi);
	}

	// 5. Business methods

}
