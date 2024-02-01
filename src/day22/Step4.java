package day22;

public class Step4 {

    public static boolean boxing1( String s){
        return false;
    }


     public static <T> boolean boxing2(String s){
         T t = null;
         System.out.println( t );
         return false;
     }

//     public static <T> Box3 <T> boxing3(String s){
//        Box3<String> box = new Box<>();
//        return box;
   // }

    public static <T> Box3 <T> boxing4 (T t){
        Box3 <T> box = new Box3<>();
        box.setT(t);
        return box;
    }

    public static <T extends Number > boolean compare( T t1 , T t2){
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return v1 == v2;
    }

    public static void main(String[] args) {
        Box3<Integer> box1 = boxing4(100);
        int intValue = box1.getT();

        Box3<String> box2 = boxing4("홍길동");
        String strValue = box2.getT();
    }

//    Box<Car> Box3 = boxing4(new car());
//    Car carValue = box3.getT();

    boolean result1 = compare(10,20);
    boolean result2 = compare(4.5,4.5);

}
