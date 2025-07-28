import java.util.*;

class Assign5 {
    public static float averagePositive(int[] brr){
        int sum =0;
        int count=0;
        for(int i=0;i<brr.length;i++){
            if(brr[i]>=0){
                sum += brr[i];
                count++;
            }
        }
        return ((float)sum/count);
    }
    public static void inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size:");
        int a = sc.nextInt();
        System.out.println("Enter Elements:");
        int [] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(arr));
        System.out.print(averagePositive(arr));
    }
    public static void main(String[] args) {
        inputArray();
    }    
}
