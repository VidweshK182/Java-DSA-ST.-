import java.util.*;
class Assign6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swap:a=" + a + ",b=" + b);
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println("After Swap:a="+a+" b="+b);
    }
}
