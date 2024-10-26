package homework.homeworkonseptembernineteenth.tasktwo;

import java.util.Arrays;

public class SortPerson {

    private static final Person[] people =  {
            new Person("Alice", 25),
            new Person("Bob", 20),
            new Person("Charlie", 30),
            new Person("David", 35),
            new Person("Eve", 28)
    };

    public static void main(String[] args) {
        Person[] sortedTaskArray = mergeSort(people);
        Arrays.stream(sortedTaskArray).forEach(person -> System.out.println(person));
    }

    public static Person[] mergeSort(Person[] array){
        if(array.length <= 1){
            return array;
        }
        int middle = array.length / 2;
        Person[] arrayLeft = Arrays.copyOfRange(array, 0, middle);
        Person[] arrayRight = Arrays.copyOfRange(array, middle, array.length);
        return merge(mergeSort(arrayLeft), mergeSort(arrayRight));
    }

    public static Person[] merge(Person[] arrayLeft, Person[] arrayRight){
        Person[] merged = new Person[arrayLeft.length + arrayRight.length];
        int indexLeft = 0, indexRight = 0, indexMerged = 0;
        while(indexLeft < arrayLeft.length && indexRight < arrayRight.length){
            if(arrayLeft[indexLeft].age >= arrayRight[indexRight].age){
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

    public static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
