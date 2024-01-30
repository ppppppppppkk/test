package day20;

public class InterfaceClmpl implements InterfaceC{
    //자식인터페이스를 구현할때 부모인터페이스 구현 해야한다.
    @Override
    public void methodA() {
        System.out.println("InterfaceClmpl.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceClmpl.methodB");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceClmpl.methodC");
    }

}
