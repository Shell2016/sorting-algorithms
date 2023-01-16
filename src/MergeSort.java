public class MergeSort {

    public static void mergeSort(int[] array) {
        int inputLength = array.length;
        if (inputLength < 2) {
            return;
        }

        int middleIndex = inputLength / 2;
        int[] leftHalf = new int[middleIndex];
        int[] rightHalf = new int[inputLength - middleIndex];
        for (int i = 0; i < middleIndex; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = middleIndex; i < inputLength; i++) {
            rightHalf[i - middleIndex] = array[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(array, leftHalf, rightHalf);
    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
