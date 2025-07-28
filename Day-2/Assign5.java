import java.util.*;
class Assign5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //ex:6
        int b = sc.nextInt(); //ex:3
        a = a+b; //a=9
        b = a-b; //b=9-3=6
        a = a-b; //a=9-6=3
        System.out.println("Before Swap:a="+a+",b="+b);
        System.out.println("After Swap:a="+a+",b="+b);
    }
}
