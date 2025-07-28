import java.util.*;
class Assign4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Original Value before function call: "+a);
        changeValue(a);
        System.out.println("Original Value after function call: " + a);
    }
    public static void changeValue(int x){
        x = 100;
        System.out.println("Value inside function: "+x);
    }
}
