public class QuickSort {

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }
        int pivot = array[highIndex];
        int left = partition(array, lowIndex, highIndex, pivot);

        quickSort(array, lowIndex, left - 1);
        quickSort(array, left + 1, highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int left = lowIndex;
        int right = highIndex;
        while (left < right) {
            while (array[left] <= pivot && left < right) {
                left++;
            }
            while (array[right] >= pivot && left < right) {
                right--;
            }
            swap(array, left, right);
        }
        swap(array, left, highIndex);
        return left;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }


}
