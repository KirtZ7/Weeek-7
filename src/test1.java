public class test1 {

    String name = "Kirtan"; //instance variable
    String surname = "Jagdish"; //instance variable
    static int a = 24; //static variable
    static double d = 100d; //static variable

    public static void main(String[] args) {        //Main method
        test1 t1 = new test1();     //create object
        t1.i1();    //call static method
        v1();       //call instance method
    }

    public void i1(){   // Instance Method
        System.out.println("My Name is " + name);
        System.out.println("My age is " + a);
    }

    public static void v1 (){   // Static Method
        test1 t1 = new test1();
        System.out.println("my surname is " + t1.surname);
        System.out.println("my birthday is in " + d + " days");
    }
}