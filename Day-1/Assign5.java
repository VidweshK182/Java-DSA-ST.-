import java.util.*;
class Assign5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3};
        System.out.println("Before Function call: "+Arrays.toString(arr)); 
        System.out.println("After Function call: " + Arrays.toString(modifyArray(arr)));
    }
    public static int[] modifyArray(int[] brr){
        brr[0] = 99;
        return brr;
    }
}
