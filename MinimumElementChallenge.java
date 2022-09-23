// -Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
// -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
// -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
// -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
// -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
// -Finally, print the minimum element in the array.


import java.util.Scanner;

public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the amount of entries in your array: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] usersArray = readIntegers(count);
        System.out.println("Your smallest number in your list is: " + findMin(usersArray));
    }

    public static int[] readIntegers(int count) {
        int[] numberArray = new int[count];
        for(int i=0; i< count; i++) {
            System.out.println("Enter a number: ");
            int newNumber= scanner.nextInt();
            numberArray[i] = newNumber;

        }
        return numberArray;
    }

    public static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++) {
            int value = array[i];

            if(value < min) {
                min = value;
            }
        }
        return min;
    }
}
