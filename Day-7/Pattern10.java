//Right Angle traingle with Fibonacci Series

import java.util.*;
class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k = 0;
        int l = 1;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+k+" ");
                int sum = k + l; 
                 k=l;
                 l=sum;
            }
            System.out.println();
        }
    }
}
