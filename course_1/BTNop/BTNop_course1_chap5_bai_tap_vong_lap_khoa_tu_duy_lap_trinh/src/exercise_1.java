import java.util.Scanner;
import java.util.Random;

public class exercise_1 {

	public static void main(String[] args) {
		
		int random;
		int diem_machine = 0;
		int diem_human = 0;
		String machine = "";
		boolean flag = true;
		
		Scanner scan = new Scanner (System.in);
		Random generator = new Random();

		do {
			random = generator.nextInt(3) + 1; // Bao = 1; Keo = 2; Kim = 3
			switch (random) {
				case 0:
					machine = "Bao";
				case 1:
					machine = "Keo";
				case 2:
					machine = "Kim";
			}
			System.out.print("Ban chon 'Bao | Keo | Kim' ?: ");
			String human = scan.nextLine();
			
			if (human.equals("Bao") && machine.equals("Bao")) {
				continue;
			} else if (human.equals("Bao") && machine.equals("Keo")) {
				diem_machine += 1;
			} else if (human.equals("Bao") && machine.equals("Kim")) {
				diem_machine += 1;
			} else if (human.equals("Keo") && machine.equals("Bao")) {
				diem_human += 1;
			} else if (human.equals("Keo") && machine.equals("Keo")) {
				continue;
			} else if (human.equals("Keo") && machine.equals("Kim")) {
				diem_human += 1;
			} else if (human.equals("Kim") && machine.equals("Bao")) {
				diem_human += 1;
			} else if (human.equals("Kim") && machine.equals("Keo")) {
				diem_machine += 1;
			} else if (human.equals("Kim") && machine.equals("Kim")) {
				continue;
			}
			System.out.println("Ti so Human - Machine: " + diem_human + " - " + diem_machine);
			if (diem_human < diem_machine) {
				System.out.println("May thang nhieu hon!");
			} else if (diem_human > diem_machine) {
				System.out.println("Nguoi thang nhieu hon!");
			} else if (diem_human == diem_machine) {
				System.out.println("Hai ben hoa nhau!");
			}
			System.out.println("Nhan 1 so bat ky de choi tiep | Nhan 0 de dung tro choi? ");
			int number = Integer.parseInt(scan.nextLine());
			if (number == 0) {
				flag = false;
			} else {
				flag = true;
			}
		} while (flag);
		scan.close();
		System.out.println("Tro choi ket thuc!");
	}

}
