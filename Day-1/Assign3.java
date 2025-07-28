import java.util.*;
class Assign3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String a = sc.nextLine();
        greetUser(a);
    }
    public static void greetUser(String name){
        System.out.print("Hello "+name+",Welcome to the MERN + DSA batch!");
    }
}
