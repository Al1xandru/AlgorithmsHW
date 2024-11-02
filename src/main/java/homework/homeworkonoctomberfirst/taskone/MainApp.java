package homework.homeworkonoctomberfirst.taskone;

// Task A.
// Одним из классических примеров использования амортизированного анализа является
// работа с динамическими массивами(или структурами, такими как ArrayList в Java).
// При добавлении элементов в динамический массив,
// если его текущая ёмкость не позволяет вместить новый элемент,
// происходит операция увеличения размера массива. Э
// то действие требует копирования всех существующих элементов в новый массив большего размера.


import java.util.Arrays;
import java.util.Scanner;

// Task B.
public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер исходного массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Введите количество новых элементов: ");
        int numberOfNewElements = scanner.nextInt();

        int[] expandedArray = expandArray(array, numberOfNewElements);

        System.out.println("Расширенный массив: " + Arrays.toString(expandedArray));
    }

    private static int[] expandArray(int[] originalArray, int numberOfNewElements) {
        int[] newArray = Arrays.copyOf(originalArray, originalArray.length + numberOfNewElements);
        for (int i = originalArray.length; i < newArray.length; i++) {
            newArray[i] = 0;
        }
        return newArray;
    }
}
