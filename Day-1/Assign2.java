import java.util.*;
class Assign2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        String c = sc.next();
        float d = a;      //explicit
        int e = (int) b;  //implicit
        int f = Integer.parseInt(c);
        System.out.println("Int to Float: "+d);
        System.out.println("Float to Int: "+e);
        System.out.println("String to Int: "+f);
    }
}
