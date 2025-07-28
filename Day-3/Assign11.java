import java.util.*;
class Assign11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Weight:");
        float a = sc.nextFloat();
        System.out.print("Enter Height:");
        float b = sc.nextFloat();
        System.out.print("BMI is:"+(a/(b*b)));
    }
}
