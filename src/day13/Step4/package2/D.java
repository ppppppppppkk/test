package day13.Step4.package2;

import day13.Step4.package1.A;

public class D extends A {

    public D(){
        super();
    }

    public void method1() {
        this.field = "value";
        this.method();
    }
    public void method2(){
       // A a = new A();
       // a.field = "Value";
       // a.method();
    }

}
