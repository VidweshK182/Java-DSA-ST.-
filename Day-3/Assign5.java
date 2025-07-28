import java.util.*;
class Assign5 {
    public static int max(int x,int y){
       int m = (x>y) ? x : y;
       return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1:");
        int a = sc.nextInt();
        System.out.print("Enter Number2:");
        int b = sc.nextInt();
        System.out.print("Greater number is:"+max(a,b));
    }
}
