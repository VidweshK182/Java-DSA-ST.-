import java.util.*;
class Assign3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your nummber:");
        int a = sc.nextInt();
        System.out.println("The number is "+(a/2==0?"Even":"Odd"));
    }
}
