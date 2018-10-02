public class QuickSort implements SortingAlgorithm {

	public void sort(int[] arr) {
		quicksort(arr, 0, arr.length-1);
	}

	public void quicksort(int[] arr, int start, int end) {
		if (end <= start || end < 0 || start < 0) {
			return;
		}

		int pivot = arr[start];
		int leftMark = start + 1;
		int rightMark = end;

		while(rightMark > leftMark - 1) {
			while(arr[leftMark] < pivot) {
				leftMark++;
			}

			while(arr[rightMark] > pivot) {
				rightMark--;
			}

			if (rightMark != leftMark - 1) {
				swap(arr, leftMark, rightMark);
				leftMark++;
			}
		}

		swap(arr, start, rightMark);

		quicksort(arr, start, rightMark-1);
		quicksort(arr, rightMark+1, end);
	}

	public void swap(int[] arr, int pivot, int rightMark) {
		int temp = arr[rightMark];
		arr[rightMark] = arr[pivot];
		arr[pivot] = temp;
	}
}
