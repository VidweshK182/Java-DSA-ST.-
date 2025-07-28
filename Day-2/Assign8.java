import java.util.*;
class Assign8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length:");
        int l = sc.nextInt();
        System.out.print("Breadth:");
        int b = sc.nextInt();
        System.out.println("Perimeter:"+(2*(l+b)));
        System.out.println("Area:"+(l*b));
    }
}
