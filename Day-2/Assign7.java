import java.util.*;
class Assign7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius:");
        int C = sc.nextInt(); //float C = sc.nextFloat();
        System.out.print("Fahrenheit:"+((C*9/5.0)+32));  // System.out.print("Fahrenheit:"+((C*9/5)+32));
        //or 5f can be used instead of 5.0 
    }
}
