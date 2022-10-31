import java.util.Calendar;
import java.util.Scanner;

public class GiaoVien extends ThanhVien {
	// 1. Attributes
	final static int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);

	static int soGiaoVien;
	private int namBatDauDay;
	private String chuyenMon;
	private int thamNien;

	// 2. Setter, Getter
	public int getNamBatDauDay() {
		return namBatDauDay;
	}

	public void setNamBatDauDay(int namBatDauDay) {
		this.namBatDauDay = namBatDauDay;
	}

	public String getChuyenMon() {
		return chuyenMon;
	}

	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}

	public int getThamNien() {
		return thamNien;
	}

	// 3. Constructors
	{
		soGiaoVien++;
	}

	public GiaoVien() {
//		tinhThamNien();
	}

	public GiaoVien(int maThanhVien, String hoTen, int namSinh, String noiSinh, String diaChi, int namBatDauDay,
			String chuyenMon) {
		super(maThanhVien, hoTen, namSinh, noiSinh, diaChi);
		this.namBatDauDay = namBatDauDay;
		this.chuyenMon = chuyenMon;
	}

	// 4. In, Out methods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);

		System.out.print("Nhập Năm bắt đầu dạy: ");
		this.namBatDauDay = Integer.parseInt(scan.nextLine());

		System.out.print("Nhập chuyên môn (Tự nhiên | Xã hội): ");
		this.chuyenMon = scan.nextLine();
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\tNăm bắt đầu dạy: " + this.namBatDauDay + "\tChuyên Môn: " + this.chuyenMon + "\tThâm Niên: "
				+ this.thamNien);
	}

	// 5. Business methods
	public void tinhThamNien() {
		this.thamNien = CURRENT_YEAR - this.namBatDauDay;
	}
}
