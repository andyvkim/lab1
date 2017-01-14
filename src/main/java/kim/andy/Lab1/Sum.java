package kim.andy.Lab1;

import java.util.Scanner;

/**
 * Created by andykim on 1/12/17.
 */


public class Sum {

        public int getSum (int n) {

            int sum = 0;

            for (int i = 1; i <= n; i++) {

                sum = sum + i;

            }
            System.out.println(sum);
            return sum;

        }
    public static void main(String args[]){
        Sum sum1 = new Sum();
        Scanner ask = new Scanner(System.in);
        System.out.println("Give me a number");
        sum1.getSum(ask.nextInt());
    }

}

