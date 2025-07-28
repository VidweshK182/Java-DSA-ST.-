import java.util.*;
class Assign2 {
    public static void odd(int[] brr){
        int i = 0;
        int count = 0;
        while(i<brr.length){
            if((brr[i])%2 != 0){
                System.out.print((brr[i])+" ");
                count++;
            }
            i++;
        }
        System.out.println();
        System.out.print("Count:"+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size:");
        int a = sc.nextInt();
        System.out.println("Enter elements:");
        int arr[] = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        odd(arr);
    }
}
