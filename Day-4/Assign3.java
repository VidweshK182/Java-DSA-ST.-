import java.util.*;
class Assign3 {
    public static void largest(int[] brr){
        int max = brr[0];
        for(int i=1;i<brr.length;i++){
            if(brr[i]>max){
                max = brr[i];
            }
        }
        System.out.println("Maximum element:" + max);
        String s = (max % 2 == 0) ? "Even " : "Odd";
        System.out.print("It is an " + s + "number");      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size:");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        largest(arr);
    }
}
