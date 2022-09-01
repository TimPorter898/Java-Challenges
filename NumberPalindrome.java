//Write a method called isPalindrome with one int parameter called number.
//The method needs to return a boolean.
//It should return true if the number is a palindrome number otherwise it should return false.
//Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.


public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-5665));
        System.out.println(isPalindrome(1667));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int startNumber = number;

        int reverse = 0;
        while(number > 0){
            int endNumber = number % 10; // Grabs last digit of number
            number = number / 10; // Drop last digit
            reverse = reverse * 10; // Creates space for next digit to be added
            reverse += endNumber; // Adds a digit
        }
        if(startNumber == reverse){
            return true;
        }else {
            return false;
        }

    }
}
