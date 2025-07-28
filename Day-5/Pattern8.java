import java.util.*;
class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            int space = 2*i;
            int star = a-i;
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            for(int j=0;j<space;j++){
                System.out.print("_");
            }
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
