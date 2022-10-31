import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QuanLyThanhVien {
	// 1. Attributes
	final static int THAM_NIEN_5_NAM = 5;
	ArrayList<ThanhVien> qLTV;

	// 2. Setter, Getter
	public ArrayList<ThanhVien> getqLTV() {
		return qLTV;
	}

	public void setqLTV(ArrayList<ThanhVien> qLTV) {
		this.qLTV = qLTV;
	}

	// 3. Constructors
	public QuanLyThanhVien() {
		this.qLTV = new ArrayList<ThanhVien>();
	}

	// 4. In, Out methods
	public void xuat(int num) {
		for (ThanhVien thanhVien : this.qLTV) {
			if ((thanhVien instanceof GiaoVien && num == 0) || (thanhVien instanceof GiaoVien && num == 1)) {
				((GiaoVien) thanhVien).xuat();
			} else if ((thanhVien instanceof HocSinh && num == 0) || (thanhVien instanceof HocSinh && num == 2)) {
				((HocSinh) thanhVien).xuat();
			}
		}
	}

	// 5. Business methods
	public void addThanhVien(ThanhVien thanhVien) {
		this.qLTV.add(thanhVien);
	}

	public void dummyData() {
		try {
			FileReader reader = new FileReader(
					"C:\\DATA\\CyberLearn\\JavaCore\\course_5\\assignments\\Khoa5_DoAnCuoiKhoa_LeDinhAnhHuy\\src\\DanhSachThanhVien.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");
				ThanhVien tv;
				// Kiểm tra là GiaoVien hay HocSinh
				if (listInfo[1].equalsIgnoreCase("GV")) {
					tv = new GiaoVien();
					((GiaoVien) tv).setNamBatDauDay(Integer.parseInt(listInfo[6]));
					((GiaoVien) tv).setChuyenMon(listInfo[7]);
					((GiaoVien) tv).tinhThamNien();
				} else {
					tv = new HocSinh();
					((HocSinh) tv).setDiemToan(Float.parseFloat(listInfo[6]));
					((HocSinh) tv).setDiemVan(Float.parseFloat(listInfo[7]));
					((HocSinh) tv).setDiemNgoaiNgu(Float.parseFloat(listInfo[8]));
					((HocSinh) tv).tinhDiemTrungBinh();
					((HocSinh) tv).tinhXepLoai();
				}
				// Tạo dữ liệu cho mỗi ThanhVien
				tv.setMaThanhVien(Integer.parseInt(listInfo[0]));
				tv.setHoTen(listInfo[2]);
				tv.setNamSinh(Integer.parseInt(listInfo[3]));
				tv.setNoiSinh(listInfo[4]);
				tv.setDiaChi(listInfo[5]);
				// Thêm ThanhVien vào list
				this.qLTV.add(tv);
			}
			reader.close();// Đóng tập tin
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void timGiaoVienThamNienCaoNhat() {
		int max = -1;
		for (ThanhVien tv : this.qLTV) {
			if (tv instanceof GiaoVien) {
				if (((GiaoVien) tv).getThamNien() > max) {
					max = ((GiaoVien) tv).getThamNien();
				}
			}
		}
		for (ThanhVien gv : this.qLTV) {
			if (gv instanceof GiaoVien) {
				if (((GiaoVien) gv).getThamNien() == max) {
					((GiaoVien) gv).xuat();
				}
			}
		}
	}

	public void timGiaoVienThamNienHon5NamTuNhien() {
		for (ThanhVien tv : this.qLTV) {
			if (tv instanceof GiaoVien) {
				if (((GiaoVien) tv).getThamNien() > THAM_NIEN_5_NAM
						&& ((GiaoVien) tv).getChuyenMon().equalsIgnoreCase("Tự nhiên")) {
					((GiaoVien) tv).xuat();
				}
			}
		}
	}

	public float diemTrungBinhCaoNhat() {
		float diemTrungBinhCaoNhat = -1;
		for (ThanhVien tv : this.qLTV) {
			if (tv instanceof HocSinh) {
				if (((HocSinh) tv).getDiemTrungBinh() > diemTrungBinhCaoNhat) {
					diemTrungBinhCaoNhat = ((HocSinh) tv).getDiemTrungBinh();
				}
			}
		}
		return diemTrungBinhCaoNhat;
	}

	public void timHocSinhDiemTrungBinhCaoNhat(float diem) {
		for (ThanhVien tv : this.qLTV) {
			if (tv instanceof HocSinh) {
				if (((HocSinh) tv).getDiemTrungBinh() == diem) {
					((HocSinh) tv).xuat();
				}
			}
		}
	}

	public void quickSortDTBHSGiamDan() {
		ArrayList<HocSinh> listDTBQuickSort = new ArrayList<HocSinh>();

		for (ThanhVien tv : this.qLTV) {
			if (tv instanceof HocSinh) {
				listDTBQuickSort.add((HocSinh) tv);
			}
		}
		QuickSort objectQuickSort = new QuickSort();
		listDTBQuickSort = objectQuickSort.quickSort(listDTBQuickSort, 0, listDTBQuickSort.size() - 1);
		for (HocSinh hs : listDTBQuickSort) {
			hs.xuat();
		}
	}

	public void bubbleSortTenHocSinh() {
		ArrayList<HocSinh> lisTenBubbleSort = new ArrayList<HocSinh>();

		for (ThanhVien tv : this.qLTV) {
			if (tv instanceof HocSinh) {
				lisTenBubbleSort.add((HocSinh) tv);
			}
		}
		BubbleSort objectBubbleSort = new BubbleSort();
		objectBubbleSort.bubbleSort(lisTenBubbleSort);
		for (HocSinh hs : lisTenBubbleSort) {
			hs.xuat();
		}
	}
}
