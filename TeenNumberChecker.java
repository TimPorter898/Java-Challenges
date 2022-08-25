//Teen Number Checker
//We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//Write a method named hasTeen with 3 parameters of type int.
//The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
//Write another method named isTeen with 1 parameter of type int.
//The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

public class TeenNumberChecker {
    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber){
        if ((firstNumber >= 13 && firstNumber <= 19)||(secondNumber >= 13 && secondNumber <= 19)||(thirdNumber >= 13 && thirdNumber <= 19)) {
            return true;
        }else {
            return false;
        }
    }
    public static boolean isTeen(int firstNumber) {
        if((firstNumber >= 13) && (firstNumber <= 19)) {
            return true;
        }else {
            return false;
        }
    }
}
