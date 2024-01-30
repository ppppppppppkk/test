package day20;

import java.lang.reflect.Array;

public class Step4 {

    public static void printLength (String data){
        //예외가 발생할 것 같은 코드
        try{
            int result  = data.length();
            System.out.println("문자 수 "+result);

        }
       catch (NullPointerException e){
           System.out.println(e.getMessage());
           System.out.println(e.toString());
           e.printStackTrace();
       }
        finally {
            System.out.println("마무리 실행");
        }
    }
    public static void main(String[] args) {
        // 1. nullpointer
        printLength("ThisIsJAVA");
        printLength(null);

        //2.
        // class.forName("java,lang.String");

        String[] array = {"100","1oo"};
        for( int i = 0 ; i < args.length; i++){
         try{
             int value = Integer.parseInt(array[i]);

         }catch (NumberFormatException e){
             System.out.println("숫자로 변환할수 없습니다"+e.getMessage());
         }catch (ArrayIndexOutOfBoundsException e){
             System.out.println("배열 인덱스가 초과됨"+ e.getMessage());
         }

        }
    }
}
