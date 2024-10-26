package homework.homeworkonseptembertwelfth.taskone;

public class FindElementApp {

    private static final int[] FIRSTTASKARRAY = {100, 112, 256, 349, 770};
    private static final int[] SECONDTASKARRAY = {72, 86, 113, 119, 265, 445, 892};
    private static final int KTASKPOSITION = 7;

    public static void main(String[] args) {
        System.out.println(findElement(KTASKPOSITION, FIRSTTASKARRAY, SECONDTASKARRAY));
    }

    public static int findElement(int kPosition, int[] arrayOne, int[] arrayTwo){
        int i = 0, j = 0, temp = -1;
        while(kPosition > 0){
            if( i >= arrayOne.length){
                temp = arrayTwo[j];
                j++;
            } else if (j >= arrayTwo.length) {
                temp = arrayOne[i];
                i++;
            } else if (arrayOne[i] < arrayTwo[j]) {
                temp = arrayOne[i];
                i++;
            } else {
                temp = arrayTwo[j];
                j++;
            }
            kPosition--;
        }
        return temp;
    }
}
