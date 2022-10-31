import java.util.ArrayList;
import java.util.Collections;

public class QuickSort {

	public ArrayList<HocSinh> quickSort(ArrayList<HocSinh> listDTBQuickSort, int lower, int upper) {
		if (lower < upper)// this condition checks whether the array contains more than one element
		{
			// getting the index of the pivot after partition of the array
			int pivotIndex = partition(listDTBQuickSort, lower, upper);
			quickSort(listDTBQuickSort, lower, pivotIndex - 1);// sorting elements before the pivot
			quickSort(listDTBQuickSort, pivotIndex + 1, upper);// sorting elements after the pivot
		}
		return listDTBQuickSort;
	}

	// this function swaps the values present at indices i and k in array[]
	public void swap(ArrayList<HocSinh> listDTBQuickSort, int i, int j) {

		Collections.swap(listDTBQuickSort, i, j);
	}

	// here onwards, 'lower' indicates the first index of the passed array and
	// 'upper' indicates last index of the passed array

	// this function partition the array, treating the last element as the pivot
	public int partition(ArrayList<HocSinh> listDTBQuickSort, int lower, int upper) {
		int i = (lower - 1); // index of smaller element
		for (int j = lower; j < upper; j++) {
			// THIS CONDITION SORTS IN ASCENDING ORDER
			if (listDTBQuickSort.get(j).getDiemTrungBinh() > listDTBQuickSort.get(upper).getDiemTrungBinh()) {
				i++; // incrementing index of smaller element
				swap(listDTBQuickSort, i, j);// passing the addresses of the array elements for swapping
			}
		}
		swap(listDTBQuickSort, i + 1, upper);
		// swap(&array[i + 1], &array[upper]);//finally, swapping the pivot and the
		// element in the position at which pivot is supposed to be
		return (i + 1);// returning the position that the pivot would take in the sorted array
	}
}
