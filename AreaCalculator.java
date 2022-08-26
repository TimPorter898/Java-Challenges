// Use an overloaded method to calculate the area of a circle and rectangle.

public class AreaCalculator {

    public static void main(String[] args){
        double circleArea = 12d;
        System.out.println("Circle with radius of 12 is: "+ String.format("%.2f",area(circleArea),2));

        double rectangleLength = 4d;
        double rectangleWidth = 7d;
        System.out.println("Rectangle with length of 4 and width of 7 is: " + String.format("%.2f",area(rectangleWidth,
                rectangleLength),2));
    }
    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }else {
            return (radius * radius * Math.PI);
        }
    }
    public static double area(double x, double y) {
        if((x < 0) || (y < 0)){
            return -1;
        }else{
            return (x * y);
        }
    }

}
