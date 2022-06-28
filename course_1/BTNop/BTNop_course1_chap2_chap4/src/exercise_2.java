import java.util.Scanner;

public class exercise_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Số USD:");
		int USD = input.nextInt();
		input.close();
		
		int VND = USD*23500;
		System.out.print(VND + " " + "VND");
		
	}

}
