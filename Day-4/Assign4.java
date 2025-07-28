import java.util.*;
class Assign4 {
    public static void greaterThanX(int[] brr, int y){
        for(int i : brr){
            if(i>y){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size:");
        int a = sc.nextInt();
        int [] arr = new int[a];
        System.out.println("Enter elements:");
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter x value:");
        int b = sc.nextInt();
        System.out.print("Elements greater than x:");
        greaterThanX(arr, b);
    }
}
