import java.util.*;
class Assign8{
    public static int countDivisible_3(int[] brr){
        int count = 0;
        for(int i=0;i<brr.length;i++){
            if(brr[i] % 3 == 0){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size:");
        int a = sc.nextInt();
        int [] arr = new int[a];
        System.out.print("Enter Elements:");
         for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Count of numbers divisible by 3:"+countDivisible_3(arr));
    }
}
