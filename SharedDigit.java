//Write a method named hasSharedDigit with two parameters of type int.
//Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.


public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber<10)||(99<firstNumber)||(secondNumber<10)||(99<secondNumber)){
            return false;
        }else {
            boolean sharedDigit = false;
            while (firstNumber>0) {
                int firstNumberDigit = firstNumber % 10;
                int resetSecondNumber = secondNumber; // Resets secondNumber else will not go back into loop on next iterations
                while(resetSecondNumber>0){
                    int secondNumberDigit = resetSecondNumber % 10;
                    if(firstNumberDigit == secondNumberDigit) {
                        sharedDigit = true;
                        break;
                    }else{
                        resetSecondNumber /= 10;
                    }
                }
                firstNumber /= 10;
                }
            return sharedDigit;
            }

        }

    }