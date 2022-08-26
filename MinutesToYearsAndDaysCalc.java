// Create a function that takes an input in long and years, days, hours and minutes from the input value.

public class MinutesToYearsAndDaysCalc {


    public static void main(String[] args) {

    printYearsAndDays(561665);

    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {
            double years = Math.floor(minutes/525600);
            double newMinutes = minutes % 525600;
            double days = newMinutes/1440;
            newMinutes = newMinutes % 1440;
            double hours = newMinutes/60;
            newMinutes = newMinutes % 60;

            System.out.println(minutes+" min = " +String.format("%.0f",years)+ "y, "
                    +String.format("%.0f",days)+ "d, "+String.format("%.0f",hours)+ "h and "+
                    String.format("%.0f",newMinutes)+"m");
        }
    }


}
