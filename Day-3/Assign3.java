import java.util.*;
class Assign3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
        short s = sc.nextShort();
        char c = sc.next().charAt(0);
        int i = sc.nextInt();
        System.out.println("Expression: b+s+c+i="+(b+s+c+i));
    }
}
