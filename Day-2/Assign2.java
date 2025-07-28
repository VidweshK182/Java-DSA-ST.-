import java.util.*;
class Assign2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Divison:"+(a/b));
        System.out.println("Modulus:"+(a%b));
        System.out.println("Greater than:"+(a>b));
        System.out.println("Less than:" + (a<b));
        System.out.println("Equal to:" + (a == b));
        System.out.println("Logical AND: "+(a>5 && b<10));
        System.out.println("Logical OR:" + (a>10 || b<10));
        System.out.println("Bitwise AND:"+(a&b));
        System.out.println("Bitwise OR:"+(a|b));
        System.out.println("Left Shift:"+(a<<1));
        System.out.println("Right Shift:" + (a >> 1));
    }
}
