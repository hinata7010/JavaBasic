package model.test;

public class C {

    public static void main(String[] args) {
        A s1, s2;
        B x1, x2;

        s1 = new A();
        s2 = new A();

        x1 = new B();
        x2 = new B();


        s1.a1();
        x1.b1();
        s1.a2();
        x1.b3(s1.a3());
        System.out.println(x1.b4(s1.a3()));

        //B타입의 x1객체에
    }
}
