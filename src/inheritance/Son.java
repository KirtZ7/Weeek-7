package inheritance;

public class Son extends Father {
    public void s1(){
        System.out.println("Son class s1 method");
        System.out.println("LVL 3");
    }

    public void s2(){
        System.out.println("Son class s2 method");
        System.out.println("LVL 3");
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.s1();
        s.s2();
        s.f1();
        s.f2();
        s.g1();
        s.g2();
    }
}
