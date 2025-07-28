//X pattern with numerical

import java.util.*;

class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==j || (i+j)==(a+1) ){
                    System.out.print(" "+j+" ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
}   }
