package inheritance;

public class Father extends Grandfather {
    public void f1(){
        System.out.println("Father class f1 method");
        System.out.println("LVL 2");
    }

    public void f2(){
        System.out.println("Father class f2 method");
        System.out.println("LVL 2");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.f1();
        f.f2();
        f.g1();
        f.g2();

    }
}
