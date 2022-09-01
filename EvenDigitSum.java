//Write a method named getEvenDigitSum with one parameter of type int called number.
//The method should return the sum of the even digits within the number.
//If the number is negative, the method should return -1 to indicate an invalid value.

public class EvenDigitSum {
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(68));

    }
    public static int getEvenDigitSum(int number) {
        if(number < 0){
            return -1;
        }
        else {
            int sum = 0;
            while(number > 0) {
                if(number % 2 ==0) {
                    int digitNumber = number % 10;
                    sum += digitNumber;
                }
                number /= 10;
            }
            return sum;
        }
    }
}