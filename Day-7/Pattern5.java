import java.util.*;

class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = 'A';
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(b + " ");
                b++;
            }
            System.out.println();
        }
    }
}
