package inheritance;

public class Grandfather {
    public void g1(){
        System.out.println("Grandfather class g1 method");
        System.out.println("LVL 1");
    }

    public void g2(){
        System.out.println("Grandfather class g2 method");
        System.out.println("LVL 1");
    }

    public static void main(String[] args) {
        Grandfather g = new Grandfather();
        g.g1();
        g.g2();

    }
}
