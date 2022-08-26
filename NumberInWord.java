// Create a switch statement with an integer input value that returns the name of the number.
// 0-9 corresponding with "ZERO"-"NINE". If the value is less than 0 or greater than 9 return "OTHER"



public class NumberInWord {

    public static void main(String[] args) {

        printNumberInWord(8);

    }

    public static void printNumberInWord(int number) {
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default :
                System.out.println("OTHER");
                break;

        }

    }





}
