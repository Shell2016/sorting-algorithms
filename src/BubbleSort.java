public class BubbleSort {

    public static void bubbleSort(int[] array) {
        boolean isSwapped = true;
        while (isSwapped) {
            isSwapped = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    isSwapped = true;
                }
            }
        }
    }


}
