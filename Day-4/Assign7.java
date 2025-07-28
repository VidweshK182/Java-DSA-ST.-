import java.util.*;
class Assign7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        int a=0;
        do{
            System.out.print("Enter number:");
             a = sc.nextInt();
            sum += a;
            i++;
        }while(a!=0);
        System.out.print("The sum is:"+sum);
    }
}
