// -Write a method called reverse() with an int array as a parameter.
// -The method should not return any value. In other words, the method is allowed to modify the array parameter.
// -In main() test the reverse() method and print the array both reversed and non-reversed.
// -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
// -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the amount of entries in your array: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] usersArray = readIntegers(count);
        System.out.println("Your array is : " + Arrays.toString(usersArray));
        reverse(usersArray);
        System.out.println("Your array reversed is: " + Arrays.toString(usersArray));


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

    public static void reverse(int[] array) {

        int maxIndex = array.length -1;
        int halfLength = array.length /2;
        for(int i=0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
    }

}
