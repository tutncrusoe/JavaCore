import java.util.ArrayList;

public class DanhSachGiaoDich {
	// 1. Attributes
	private ArrayList<GiaoDich> listGiaoDich;
	private int SoLuongGiaoDichDat;
	private int SoLuongGiaoDichNha;
	private float ThanhTienGiaoDichDat;

	// 2. Setter, Getter
	public ArrayList<GiaoDich> getListGiaoDich() {
		return listGiaoDich;
	}

	public void setListGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	// 3. Constructor
	public DanhSachGiaoDich() {
		this.listGiaoDich = new ArrayList<GiaoDich>();
	}

	public DanhSachGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	// 4. In, Out methods
	public void them(GiaoDich GD) {
		this.listGiaoDich.add(GD);
	}

	public void xuat() {
		for (GiaoDich GD : this.listGiaoDich) {
			GD.xuat();
		}
	}

	// 5. Business methods
	public void dummyData() {

		GiaoDich GD = new GiaoDichDat(1, 25, 9, 2013, 2000, 100, "A");
		this.listGiaoDich.add(GD);
		GD = new GiaoDichDat(2, 25, 9, 2013, 1000, 50, "B");
		this.listGiaoDich.add(GD);
		GD = new GiaoDichDat(3, 25, 10, 2014, 500, 70, "C");
		this.listGiaoDich.add(GD);

		GD = new GiaoDichNha(4, 30, 9, 2013, 1000, 50, "Cao Cap", "HCM");
		this.listGiaoDich.add(GD);
		GD = new GiaoDichNha(5, 1, 8, 2013, 1000, 50, "Thuong", "SG");
		this.listGiaoDich.add(GD);
	}

	public int tinhTongGiaoDichDat() {
		this.SoLuongGiaoDichDat = 0;
		for (GiaoDich GD : this.listGiaoDich) {
			if (GD instanceof GiaoDichDat) {
				this.SoLuongGiaoDichDat++;
			}
		}
		return this.SoLuongGiaoDichDat;
	}

	public int tinhTongGiaoDichNha() {
		this.SoLuongGiaoDichNha = 0;
		for (GiaoDich GD : this.listGiaoDich) {
			if (GD instanceof GiaoDichNha) {
				this.SoLuongGiaoDichNha++;
			}
		}
		return this.SoLuongGiaoDichNha;
	}

	public void tinhTongThanhTienGiaoDichDat() {
		this.ThanhTienGiaoDichDat = 0;
		for (GiaoDich GD : this.listGiaoDich) {
			if (GD instanceof GiaoDichDat) {
				this.ThanhTienGiaoDichDat += ((GiaoDichDat) GD).tinhThanhTien();
			}
		}
		System.out.println("Trung Binh ThanhTienGiaoDichDat = " + (this.ThanhTienGiaoDichDat / tinhTongGiaoDichDat()));
	}
	
	public void xuatThang9_2013() {
		for (GiaoDich GD : this.listGiaoDich) {
			if (GD.getThangGiaoDich() == 9 && GD.getNamGiaoDich() == 2013) {
				GD.xuat();
			}
		}
	}

}