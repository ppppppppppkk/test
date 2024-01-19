package day14;


class A { }
class B extends A{ }
class C extends A{ }
class D extends B { }
class E extends C { }

public class Step1 {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        //
        A a1 = b;
        A a2 = d;
        A a3 = e;
        A a4 = c;

        B b1 = d;
        C c1 = e;
       // B b3 = e;//블가능
       // C c2 = d;//불가능

    }// m e
}// c e
