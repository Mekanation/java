package udemy_exercises;

import java.util.*;


class Sorting {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] sortIntegers(int[] nums) {
        int[] sortedArray = Arrays.copyOf(nums, nums.length);

        boolean flag = true;
        int temp;
        while(flag){
            flag = false;


            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;

    }

    public static void printNums(String methodCalled, int[] arrayOfNums) {
        System.out.println(methodCalled + Arrays.toString(arrayOfNums));

//        for(int i=0; i<arrayOfNums.length; i++){
//            System.out.println(arrayOfNums[i]);
//        }
        //Crappy tim bulchalka way


    }

    public static int[] getNums(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void reverse(int[] numbers) {
        for(int i=0; i<numbers.length/2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length -i - 1];
            numbers[numbers.length -i -1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] enteredNums = getNums(5);
        printNums("You have entered: ",enteredNums);
        int[] sortedNums = sortIntegers(enteredNums);
        printNums("This is what you entered sorted: ", sortedNums);

        reverse(sortedNums);

        printNums("This is what you had but now in reverse!", sortedNums);



    }

}

/*
Sorting
sortIntegers() - Create a Java function that sorts a list of integers in descending order
    getIntegers() - returns an array of entered integers from keyboard
    printArray() - prints out the contents of the array
    sortIntegers() - sort the array and return a new array containing the sorted numbers
reverseArray()
Write a method called reverse() that takes an integer array, and reverses it. This method should not return the array.
It only modifies the array passed into it. Do you think this function is pure or impure? Impure
The method should not return any value. In other words, the method is allowed to modify the array parameter.
In main() test the reverse() method and print the array both reversed and non- reversed.

 */