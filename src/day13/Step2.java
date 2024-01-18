package day13;

import day11.exam01.package2.C;

public class Step2 {
    public static void main(String[] args) {
        int r = 10;

        Calulator calulator = new Calulator();
        System.out.println("원 면적"+calulator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적"+computer.areaCircle(r));
        System.out.println();
    }
}
