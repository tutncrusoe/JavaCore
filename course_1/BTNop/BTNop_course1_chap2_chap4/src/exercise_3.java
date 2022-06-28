import java.util.Scanner;
import java.lang.Math;

public class exercise_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap vao xC: ");
		float xC = input.nextFloat();
		
		System.out.print("Nhap vao yC: ");
		float yC = input.nextFloat();
		
		System.out.print("Nhap vao R: ");
		float R = input.nextFloat();
		
		System.out.print("Nhap vao xM: ");
		float xM = input.nextFloat();
		
		System.out.print("Nhap vao yM: ");
		float yM = input.nextFloat();
		
		input.close();
		
		double distance_2 = (double)((xM-xC)*(xM-xC) + (yM-yC)*(yM-yC));
		
		double distance = Math.sqrt((double)(distance_2)); 
		
		if (distance <= R) {
		System.out.print("M nam trong C()");
		} else {
			System.out.print("M nam ngoai C()");
		}
	}

}
