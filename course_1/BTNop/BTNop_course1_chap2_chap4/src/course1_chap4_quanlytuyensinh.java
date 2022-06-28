import java.util.Scanner;

public class course1_chap4_quanlytuyensinh {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Điểm chuẩn hội đồng: ");
		float diemchuan = scan.nextFloat();
		
		System.out.print("Điểm môn 1 của thí sinh: ");
		float diem_mon1 = scan.nextFloat();
		System.out.print("Điểm môn 2 của thí sinh: ");
		float diem_mon2 = scan.nextFloat();
		System.out.print("Điểm môn 3 của thí sinh: ");
		float diem_mon3 = scan.nextFloat();

		System.out.print("Khu vực (Nhập X nếu không thuộc khu vực ưu tiên): ");
		String khuvuc = scan.next();
		System.out.print("Đối tượng dự thi (Nhập 0 nếu không thuộc đối tượng ưu tiên): ");
		int doituong = scan.nextInt();
		scan.close();
		
		float diemkhuvuc, diemdoituong;
		
		if (khuvuc == "A") { //dau ngoac kep
			diemkhuvuc = 2.0f;
		} else if (khuvuc == "B") {
			diemkhuvuc = 1.0f;
		} else if (khuvuc == "C") {
			diemkhuvuc = 0.5f;
		} else {
			diemkhuvuc = 0.0f;
		}
		
		switch(doituong) {
		case 1:
			diemdoituong = 2.5f;
		case 2:
			diemdoituong = 1.5f;
		case 3:
			diemdoituong = 1.0f;
		default:
			diemdoituong = 0.0f;
		}
		
		float diemuutien, diemtongket;
		diemuutien = diemkhuvuc + diemdoituong;
		diemtongket = diem_mon1 + diem_mon2 + diem_mon3 + diemuutien;
		
		if ((diemtongket >= diemchuan) && (diem_mon1 != 0) && (diem_mon2 != 0) && (diem_mon3 != 0)) {
			System.out.print("Thí sinh đậu với số điểm: " + diemtongket);
		} else {
			System.out.print("Thí sinh rớt với " + diemtongket);
		}
	}

}
