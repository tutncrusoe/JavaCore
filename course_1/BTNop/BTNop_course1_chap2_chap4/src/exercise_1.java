import java.util.Scanner;

class exercise_1 {
	
	public static void main(String[] args) {
		
		// Create object input
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5;
		
		System.out.print("Nhập vào một số nguyên:");
		num1 = input.nextInt();
		
		System.out.print("Nhập vào một số nguyên:");
		num2 = input.nextInt();
		

		System.out.print("Nhập vào một số nguyên:");
		num3 = input.nextInt();
		
		System.out.print("Nhập vào một số nguyên:");
		num4 = input.nextInt();
		

		System.out.print("Nhập vào một số nguyên:");
		num5 = input.nextInt();
		
		// fix the input error
		input.close();
		
		float average = (float)(num1 + num2 + num3 + num4 + num5)/5;
		System.out.print("Gia tri trung binh =" + average);
	}
}