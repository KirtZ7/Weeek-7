package statements;

public class Switch {
    public static void main(String[] args) {

        int day = 3;
        switch (day) {

           //When Java reaches a break keyword, it breaks out of the switch block.
            // break can save a lot of execution time because it "ignores" the execution of all the rest of the code in the switch block.
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend"); //Default runs if there is no case match
        }
    }
}
