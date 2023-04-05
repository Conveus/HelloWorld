import java.util.Scanner;

public class UsingName {
    public static void main(String[] args) {

        //This is a way of getting user input
        Scanner reader = new Scanner(System.in);
        String fName;
        String sName;
        byte age;

        System.out.print("Please enter your first name: ");
        fName = reader.nextLine();

        System.out.print("Please enter your last name: ");
        sName = reader.nextLine();

        System.out.print("Please enter your age: ");
        // This is for error catching, it tries to execute the code and if it fails...
        try {
            age = reader.nextByte();
        }
        // Runs this
        catch(Exception e){
            System.out.println("You've entered and incorrect value. Your age has been defaulted to 18");
            age = 18;
        }

        // printf allows using variables in the middle of prints more neatly
        System.out.printf("Your name is: %s, and you are %d years old. Nice to meet you! %n", fName, age);

        // You can also use a variable multiple times
        System.out.printf("Your name is: %s %s, and you are %d years old. Nice to meet you! %n", fName, sName, age);
        // To use the same variable more than once you have to use it multiple times at the end
        System.out.printf("Your name is: %s %s, and you %s are %d years old? Nice to meet you! %n", fName, sName, fName, age);
    }
}
