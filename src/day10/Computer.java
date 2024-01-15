package day10;


import java.util.Arrays;

public class Computer {

int sum2( int x, int y){
    int result = x + y;
    return result;
}
    int sum( int ...values){

        System.out.println("values =" + values);
        System.out.println("values =" + Arrays.toString(values));

        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }
    int sum3(int[] values){
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
        return 0;
    }
}
