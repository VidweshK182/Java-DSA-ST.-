//Swastik Symbol

import java.util.*;
class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==(a/2)+1 || j==(a/2)+1 || (i==1 && j<=a/2 ) || (i==a && j>a/2) || (j==a && i<a/2) || (j==1 && i>a/2)){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

