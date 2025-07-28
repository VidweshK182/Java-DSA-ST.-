import java.util.*;
class Assign4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number:");
        int a = sc.nextInt();
        System.out.println("Original:"+a);
        System.out.println("Pre-Increment:"+(++a));
        System.out.println("Post-Increment:"+(a++)+"(printed)"+",then becomes "+a);
        System.out.println("Pre-Decrement:"+(--a));
        System.out.println("Post-Decrement:" + (a--)+"(printed)" + ",then becomes "+a);
    }
}
