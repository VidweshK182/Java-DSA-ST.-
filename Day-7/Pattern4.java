import java.util.*;
class Pattern4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = 'A';
        for(int i=1;i<=a;i++){   
            char c = b;   
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
            b++;
        }
    }
}