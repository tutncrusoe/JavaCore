import java.util.Scanner;

public class course1_chap4_tinhthuethunhapcanhan {

	static final float phu_thuoc = 1.6f;
	static final float ban_than = 4.0f;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Họ tên: ");
		String hoten = scan.nextLine();
		
		System.out.print("Tổng thu nhập năm (triệu): ");
		float thu_nhap_nam = scan.nextFloat();
		
		System.out.print("Số người phụ thuộc: ");
		int so_nguoi_phu_thuoc = scan.nextInt();
		
		scan.close(); 
	
		float thue_suat = tinh_thue_suat(thu_nhap_nam);
		float tong_giam_tru = tinh_tong_giam_tru(ban_than, so_nguoi_phu_thuoc);
		float thu_nhap_tinh_thue = tinh_thu_nhap_tinh_thue(thu_nhap_nam, tong_giam_tru);
		float so_thue_phai_nop = tinh_so_thue_phai_nop(thu_nhap_tinh_thue, thue_suat);
		
		System.out.printf("Thuế TNCN " + hoten +  " phải trả: " + so_thue_phai_nop + " triệu");
		
	}

	public static float tinh_thue_suat(float thu_nhap_nam) {
		float thue_suat = 0.0f;
		
		if (thu_nhap_nam <= 60) {
			thue_suat = 0.05f;
		} else if (60 < thu_nhap_nam && thu_nhap_nam <= 120) {
			thue_suat = 0.1f;
		} else if (120 < thu_nhap_nam && thu_nhap_nam <= 216) {
			thue_suat = 0.15f;
		} else if (216 < thu_nhap_nam && thu_nhap_nam <= 384) {
			thue_suat = 0.2f;
		} else if (384 < thu_nhap_nam && thu_nhap_nam <= 624) {
			thue_suat = 0.25f;
		} else if (624 < thu_nhap_nam && thu_nhap_nam <= 960) {
			thue_suat = 0.3f;
		} else if (thu_nhap_nam > 960) {
			thue_suat = 0.35f;
		}
		return thue_suat;
	}
	
	public static float tinh_tong_giam_tru(float ban_than, int so_nguoi_phu_thuoc) {
		return (ban_than + so_nguoi_phu_thuoc*phu_thuoc);
	}
	
	public static float tinh_thu_nhap_tinh_thue(float thu_nhap_nam, float tong_giam_tru) {
		return thu_nhap_nam - tong_giam_tru;
	}
	
	public static float tinh_so_thue_phai_nop(float thu_nhap_tinh_thue, float thue_suat) {
		return thu_nhap_tinh_thue*thue_suat;
	}
}
