package ex_01_Java_Basics_Par2;

public class Lab014_TwoMainMethods {
    public static void main(String[] args) {
        System.out.println("JVM will recognoize this main method as it is the 1st one");
    }

    public static void main(int args) {
        System.out.println("Though two main methods are acceptable, JVM will not recognize this");
        //Two main methods will be accepted only with main method overloading
    }
}
