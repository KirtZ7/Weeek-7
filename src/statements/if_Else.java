package statements;

public class if_Else {

    public static void main(String[] args) {


        /* --- Statement 1 --- */

        // simple if statement
        int a = 20;
        int b = 50;

        if (a < b) {
            System.out.println("20 is greater than 18");
        }

        /* --- Statement 2 --- */

        // IF else statement
        int time = 20;
        if (time < 18) { //check condition
            System.out.println("Good day."); // if true of condition
        } else { //if false of condition
            System.out.println("Good evening.");
        }

        //if statement enhanced - shorthand
        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        /* --- Statement 3 --- */

        int time1 = 16;
        if (time1 < 10) { //condition
            System.out.println("Good morning."); //print if true
        } else if (time1 < 18) {
            System.out.println("Good day."); //print if true
        } else {
            System.out.println("Good evening."); //print if true
        }

    }

}

