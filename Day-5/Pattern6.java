//   *    *     star=1 spac=4 star=1   i = 1
//   **  **     star=2 spac=2 star=2   i = 2
//   ******     star=3 spac=0 star=3   i = 3

import java.util.*;
class Pattern6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            int star = i;
            int space = (2*(a-i));
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print("_");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}