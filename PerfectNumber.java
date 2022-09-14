// A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
// Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
// For example, take the number 6:
// Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.
// Therefore, 6 is a perfect number (as well as the first perfect number).

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(6));
    }


    public static boolean isPerfectNumber(int number) {
        if(number <1) {
            return false;
        }else {
            int totalDivisors = 0;
            for(int i=number-1; i > 0; i--) {
                if(number % i == 0) {
                    totalDivisors += i;
                }
            }
            if(number - totalDivisors == 0) {
                return true;
            }else {
                return false;
            }
        }
    }
}
