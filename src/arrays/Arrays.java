package arrays;

public class Arrays {



    public static void main(String[] args) {


        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; //filled array


        // i = index - check if index < length of array - print each index one by one from index 0
        for (int i = 0; i < cars.length; i++) { //basic for loop
            System.out.println(cars[i]);
        }
        for (String s : cars) { //enhanced for
            System.out.println(s);
        }

        // Multi dimension arrays
        //rows      //columns
        int[][] myNumbers = {{1, 2, 3, 4},
                {5, 6, 7},
                {8, 9, 10, 11}};

        System.out.println(myNumbers[1][2]);
        System.out.println(myNumbers[2][3]);

    }
}

