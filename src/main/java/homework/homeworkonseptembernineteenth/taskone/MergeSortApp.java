package homework.homeworkonseptembernineteenth.taskone;

import java.util.Arrays;

public class MergeSortApp {

    private static final int[] TASKARRAY = {3, 8, 1, 9, 4, 2, 7, 6, 5 };

    public static void main(String[] args) {
        int[] sortedTaskArray = mergeSort(TASKARRAY);
        System.out.println(Arrays.toString(sortedTaskArray));
    }

    public static int[] mergeSort(int[] array){
        if(array.length < 2){
            return array;
        }
        int middle = array.length / 2;
        int[] arrayLeft = Arrays.copyOfRange(array, 0, middle);
        int[] arrayRight = Arrays.copyOfRange(array, middle, array.length);
        return merge(mergeSort(arrayLeft), mergeSort(arrayRight));
    }

    public static int[] merge(int[] arrayLeft, int[] arrayRight){
        int[] merged = new int[arrayLeft.length + arrayRight.length];
        int indexMerged = 0, indexLeft = 0, indexRight = 0;
        while(indexLeft < arrayLeft.length && indexRight < arrayRight.length){
            if(arrayLeft[indexLeft] >= arrayRight[indexRight]){
                merged[indexMerged++] = arrayLeft[indexLeft++];
            }else{
                merged[indexMerged++] = arrayRight[indexRight++];
            }
        }
        while(indexLeft < arrayLeft.length){
            merged[indexMerged++] = arrayLeft[indexLeft++];
        }
        while(indexRight < arrayRight.length){
            merged[indexMerged++] = arrayRight[indexRight++];
        }
        return merged;
    }
}
