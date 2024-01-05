package day04;

public class Step2 {
    public static void main(String[] args) {

        System.out.printf(1+"");
        System.out.printf(2+"");
        System.out.printf(3+"");
        System.out.printf(4+"");
        System.out.printf(5+"");
        System.out.printf(6+"");
        System.out.printf(7+"");
        System.out.printf(8+"");

        for(int i = 1; i<=10; i++){
            System.out.printf(i+ " ");
        }

        int sum = 0;    //누적합계 구할려고, for 안에서도 쓰고 밖에서도 쓰고
        int i = 1;
        for( i = 1; i<100; i++){

            sum += i;
        }
        System.out.println("1~ = " +(i-1)+"합:" + sum);


        for(int m=2; m<=9; m++){
            System.out.println("==="+m +"단===");
            for(int n=1; n<=9; n++){
                System.out.println(m+"x"+n +"="+(m*n));
            }

        }

        int j = 1;
        while (j<=10){
            System.out.println( j+"");
            j++;
        }

        int sum2 =0;
        int m = 1;
        while( m<=100){
            sum2 += m;
            m++;
            System.out.println("1~"+(m-1) + "합 :"+sum2);
        }




    }
}
