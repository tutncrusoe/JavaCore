public class exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER = 10000;
		
		int tong = 0;
		int n = 1;
		while (tong <= NUMBER) {
			tong += n;
			n += 1;
		}

		System.out.print("So nguyen duong n nho nhat = " + n + " <=> 1 + 2 + ... + n > 10000");
	}
}
