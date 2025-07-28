import java.util.*;
class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=a-i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        } 
    }
}
