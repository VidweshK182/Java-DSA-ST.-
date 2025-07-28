import java.util.*;
class Assign1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your grade: ");
        float cgpa = sc.nextFloat();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("CGPA:"+cgpa);
    }
}