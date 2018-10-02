public class InsertionSort implements SortingAlgorithm {

	// We are taking a value, and shifting elements in the array right until there is a spot for value
	public void sort (int[] arr) {
		// Need to check every value, starting with 1, so move through every value
		for (int i = 1; i < arr.length; i++) {
			// So, we're only checking the values prior to the current one, meaning we need to be less than current index
				// Crete a temp variable for the value being moved
				int movingValue = arr[i];
				// k will be the value that we are moving and comparing too
				int comparingValue = i - 1;
				// While the movingValue is less than current comparing value, move comparing value right
				while (comparingValue > -1 && movingValue < arr[comparingValue]) {
					arr[comparingValue+1] = arr[comparingValue];
					comparingValue--;
				}

			// After the while loop, we know what spot to put or movingValue into
			arr[comparingValue+1] = movingValue;
		}
	}
}
