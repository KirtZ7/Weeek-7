package statements;

public class For_Loop {
    public static void main(String[] args) {

        for (int i = 0;  //Sets a variable before the loop starts (int i = 0)
             i < 5; //defines the condition for loop to run. If condition is true,loop will start again, if false,loop will end
             i++){ //increases a value (i++) each time the code block in the loop has been executed.
            System.out.println(i); //print i
        }

        // Outer loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

    }
}
