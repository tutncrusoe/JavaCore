import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

	public void bubbleSort(ArrayList<HocSinh> lisTenBubbleSort) {
		int i, j;

		boolean swapped = false;

		// lap qua tat ca cac so
		for (i = 0; i < lisTenBubbleSort.size() - 1; i++) {
			swapped = false;

			// vong lap thu hai
			for (j = 0; j < lisTenBubbleSort.size() - 1 - i; j++) {
//				System.out.print("So sanh cac phan tu: [" + lisTenBubbleSort.get(j).getHoTen() + ", "
//						+ lisTenBubbleSort.get(j + 1).getHoTen() + "]");

				// kiem xa xem so ke tiep co nho hon so hien tai hay khong
				// trao doi cac so.
				// (Muc dich: lam noi bot (bubble) so lon nhat)
				if (lisTenBubbleSort.get(j).getHoTen().compareTo(lisTenBubbleSort.get(j + 1).getHoTen()) > 0) {
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
					Collections.swap(lisTenBubbleSort, j, j+1);
					swapped = true;
//					System.out.println(" => trao doi [" + lisTenBubbleSort.get(j).getHoTen() + ", "
//							+ lisTenBubbleSort.get(j + 1).getHoTen() + "]");
				} else {
//					System.out.println(" => khong can trao doi.");
				}
			}

			// neu khong can trao doi nua, tuc la
			// mang da duoc sap xep va thoat khoi vong lap.
			if (!swapped) {
				break;
			}

//			System.out.println("Vong lap thu " + (i + 1));
		}
	}
}
