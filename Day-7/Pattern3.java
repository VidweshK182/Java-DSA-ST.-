import java.util.*;
class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = 'A';
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                System.out.print(b+" ");
            }
            System.out.println();
            b++;
        }
    }
}
