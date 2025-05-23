package ex_01_Java_Basics_Par2;

public class Lab023_LocalVariable {
    public static void main(String[] args) {
        int age = 10;
        System.out.println("Here is 'age' is local variable to this main method, but not to the below method");

    }

    public static void main(int args) {
        int score = 200;
        System.out.println("Here is 'score' is local variable to this main method, but not to the above method");


    }
}
