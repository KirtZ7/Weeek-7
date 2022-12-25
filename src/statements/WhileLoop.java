package statements;

public class WhileLoop { //while loop
    public static void main(String[] args) {

        int i = 0; // i is 0
        while (i < 5) { //code will run as long as a variable (i) is less than 5
            System.out.println(i);
            i++; //(i) increments by +1 till it gets to 5
        }


        //The loop will always be executed at least once
        // even if the condition is false
        // the code block is executed before the condition is tested

        int e = 0; // e is 0
        do {
            System.out.println(e);
            e++;
        }
        while (e < 5);
    }
}
