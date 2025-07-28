import java.util.*;
class Assign7 {
    public static int getSqaure(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int a = sc.nextInt();
        return a*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(getSqaure());
    }
}
