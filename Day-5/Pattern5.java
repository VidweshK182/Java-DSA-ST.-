import java.util.*;
class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            int star = a-i;
            for(int j=0;j<i;j++){
                System.out.print("_");
            }
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
