import java.util.*;
class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            int val = a-i;
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=val;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*
 123  i=0;  spa=0  3 str+sp=n
  12  i=1;  spa=1  2
   1  i=2;  spa=2  1
 */