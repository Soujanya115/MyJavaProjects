package ex_01_Java_Basics_Par2;

public class Lab015_VariableDeclaration {
    public static void main(String[] args) {
        //Syntax
        //data_type variable_name = variable Value
        //Variable name is an identifier, wich will accept alphabet, $, _ and digits
        //starting letter of the variable should be "Alphabet, $ or _ only
        //variable value can be changed any no.of time in the program

        byte age = 65;
        age = 66;
        //Here byte is "data_type", age is "Variable_name and 65 is variable value
        //Variable name is also called as identifier
        //Variable value is also called as Literal

        System.out.println(age);

        byte score = 127; //>127 value is wrong as byte will hold max value 2power7 -1 i.e. 127

    }
}
