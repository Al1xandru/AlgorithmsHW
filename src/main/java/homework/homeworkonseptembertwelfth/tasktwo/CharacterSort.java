package homework.homeworkonseptembertwelfth.tasktwo;

public class CharacterSort {

    // included ChatGPT code
    private static final String TASKSTRING = "poiuytrewqlkjhgfdsamnbvcxz";

    public static void main(String[] args) {
        char[] chars = TASKSTRING.toCharArray();
        mergeSort(chars, 0, chars.length - 1);
        String result = new String(chars).toUpperCase();
        System.out.println(result);
    }

    private static void mergeSort(char[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    //    ChatGPT  !

    private static void merge(char[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        char[] leftArray = new char[n1];
        char[] rightArray = new char[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }


        while (i < n1) {
            array[k++] = leftArray[i++];
        }
        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }

    //    ChatGPT  !

}

