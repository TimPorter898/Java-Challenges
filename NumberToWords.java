// Write a method called numberToWords with one int parameter named number.
// The method should print out the passed number using words for the digits.
// If the number is negative, print "Invalid Value".



public class NumberToWords {
    public static void main(String[] args) {

        numberToWords(100);
        System.out.println("------------------");
        numberToWords(1010);
        System.out.println("------------------");
        numberToWords(-12);
        System.out.println("------------------");
        System.out.println(getDigitCount(100));
    }


    public static void numberToWords(int number) {
        int numberOfDigits = getDigitCount(number);
        number = reverse(number);
        if(number<0) {
            System.out.println("Invalid Value");
        } else {
            for(int i=numberOfDigits; i>0; i--) {
                int digit = 0;

                    digit = number % 10;

                    switch(digit) {
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                        case 0:
                            System.out.println("Zero");
                            break;
                        default:
                            System.out.println("Unknown");

                    }
                    number /= 10;

            }
        }
    }

    public static int reverse(int number) { // Reversing the number to read from left to right
        int reverseDigits = 0;
        int digit = 0;
        while(number != 0) {
            digit = number % 10;
            reverseDigits = reverseDigits * 10 + digit;
            number /= 10;
        }
        return reverseDigits;
    }

    public static int getDigitCount(int number) { // Getting count of number of digits
        int count = 0;                            // to prevent the loss of zeros
        if(number < 0) {
            return -1;
        } else if (number == 0) {
            count += 1;
        } else {
            while(number != 0) {
                count += 1;
                number /= 10;
            }

        }
        return count;
    }
}
