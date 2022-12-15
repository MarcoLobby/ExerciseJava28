package it.DevelHope.ExerciseJava28;

public class Test {

    public static void main(String[] args) {

        int a = 15;

        // Print the original value of 'a'
        System.out.println("The value of 'a' is: " +a);

        // Task 1: print the original value of 'a' + 5 without repeat 'a'
        System.out.println("The value of 'a' + 5 is: " + (a +=5));

        // Task 2: subtract 4 to 'a' without repeat the 'a' variable
        System.out.println("The value of 'a' - 4 is: " + (a -=4));

        // Task 3: assign the value of 'a' to int 'b' and increment 'b' by one without using 'a' or 'int b = b + 1'
        int b = a;
        System.out.println("The value of 'b' is: " + b);
        System.out.println("The value of 'b' with the increment of '1' is: " + (++b));

        // Task 4: check and prints if both the following statements are true:
        // statement 1: check if b is an odd number
        System.out.println("Is 'b' an odd number? ");
        if (b %2 == 0){
            System.out.println("False");
        }else{
            System.out.println("True");
        }

        // statement 2: check if the result of (b multiplied for b + 1) is a multiple of 3
        System.out.println("The value of 'b' multiplied for 'b + 1' is: " + (b *= (b + 1)));
        System.out.println("Is '306' a multiple of '3'? ");

        if ((b *= (b + 1)) %3 == 0) {
            System.out.println("True");
        }else{
            System.out.println("False");

        }
    }
}
