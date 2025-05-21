package ex_01_Java_Basics_Part1;

public class Multiple_Main_Methods {
    public static void main(String[] args) {

    }

    public static void main(String[] args) {
        //Same main method with String[] is not acceptable
    }

    public static void main(int args) {
        //No Red highlight. This main method is valid as it is declared ith "Int".
        // But there is no Run button and this will not execute
    }
    public static void main(String args) {
        //No Red highlight. This main method is valid as it is declared ith "String".
        // But there is no Run button and this will not execute
    }
    //There can be multiple main methids, but JVM will recognize only one
    // This concept is called main method overloading
}
