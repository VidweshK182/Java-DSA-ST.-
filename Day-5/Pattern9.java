import java.util.*;
class Pattern9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=a;i>0;i-- ){
            int star = (2*i)-1;
            for(int j=0;j<a-i;j++){
                System.out.print("_");
            }
            for(int j=star;j>0;j--){ 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
