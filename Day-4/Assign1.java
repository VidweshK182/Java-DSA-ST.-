import java.util.*;
class Assign1{
    public static int sum(int [] brr){
        int sum = 0;
        for (int j = 0; j < brr.length; j++) {
            if ((brr[j]) % 2 == 0) {
                sum += brr[j];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int a = sc.nextInt();
        int [] arr = new int[a];
        System.out.println("Enter elements:");
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("The sum of even elements is:"+sum(arr));
    }
}