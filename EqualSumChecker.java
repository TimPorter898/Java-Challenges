//Equal Sum Checker
//Write a method hasEqualSum with 3 parameters of type int.
//The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.


public class EqualSumChecker {
    public static boolean hasEqualSum(int number1, int number2, int number3) {
        if (number1 + number2 == number3) {
            return true;
        }else {
            return false;
        }
    }

}
