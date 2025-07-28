class Assign6{
    public static void main(String[] args) {
        System.out.println("Main Started");
        firstStep();
        System.out.println("Main Ended");
    }
    public static void firstStep(){
        System.out.println("First Step Started");
        secondStep();
        System.out.println("First Step Ended");
    }
    public static void secondStep(){
        System.out.println("Second Step Started");
        System.out.println("Second Step Ended");
    }
}