import java.util.*;
class Assign6 {
    public static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table number:");
        int a = sc.nextInt();
        printTable(a);
    }
}
