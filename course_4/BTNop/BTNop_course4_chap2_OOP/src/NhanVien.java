import java.util.Scanner;

public class NhanVien {

	// Instances: public, private, default, protected
	private int MaNhanVien;
	private String HoVaTen;
	private int NgaySinh;
	private String DiaChi;
	private float HeSoLuong;
	private float LuongCoBan;

	// Constructor
	public NhanVien() {

	}

	public NhanVien(int maNhanVien, String hoVaTen, int ngaySinh, String diaChi, float heSoLuong, float luongCoBan) {
		this.MaNhanVien = maNhanVien;
		this.HoVaTen = hoVaTen;
		this.NgaySinh = ngaySinh;
		this.DiaChi = diaChi;
		this.HeSoLuong = heSoLuong;
		this.LuongCoBan = luongCoBan;
	}

	// Setter and Getter
	public int getMaNhanVien() {
		return MaNhanVien;
	}

	public void setMaNhanVien(int maNhanVien) {
		this.MaNhanVien = maNhanVien;
	}

	public String getHoVaTen() {
		return HoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.HoVaTen = hoVaTen;
	}

	public int getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(int ngaySinh) {
		this.NgaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		this.DiaChi = diaChi;
	}

	public float getHeSoLuong() {
		return HeSoLuong;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.HeSoLuong = heSoLuong;
	}

	public float getLuongCoBan() {
		return LuongCoBan;
	}

	public void setLuongCoBan(float luongCoBan) {
		this.LuongCoBan = luongCoBan;
	}

	// In,Out methods
	public void nhap(Scanner scan) {
		System.out.print("Nhap MaSV: ");
		this.MaNhanVien = Integer.parseInt(scan.nextLine());
		
		System.out.print("Nhap HoTen: ");
		this.HoVaTen = scan.nextLine();
		
		System.out.print("Nhap NgaySinh: ");
		this.NgaySinh = Integer.parseInt(scan.nextLine());
		
		System.out.print("Nhap DiaChi: ");
		this.DiaChi = scan.nextLine();
		
		System.out.print("Nhap HeSoLuong: ");
		this.HeSoLuong = Float.parseFloat(scan.nextLine());
		
		System.out.print("Nhap LuongCoBan: ");
		this.LuongCoBan = Float.parseFloat(scan.nextLine());		
	}

	public void xuat() {
		System.out.println("Ma NV: " + this.MaNhanVien + "\tHo Ten: " + this.HoVaTen + "\tNgay Sinh: " + this.NgaySinh
				+ "\tDia chi: " + this.DiaChi + "\tLuong: " + tinhLuongNhanVien());
	}

	// Business methods
	public float tinhLuongNhanVien() {
		return this.HeSoLuong * this.LuongCoBan;
	}

}
