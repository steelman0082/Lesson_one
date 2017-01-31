package geekbrains_lesson_3;

import java.util.Arrays;

/**
 * Created by wallb on 15.01.17.
 */
public class array {

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.println("helloWorld");

        }
        int x = 0;
        for (int j = 0; j < 5; j++) {
            x = +j;
            System.out.println(x);
        }


        System.out.println("ENd");

    /*    System.out.println(Power(2, 4));

            public static float Power(float base, float step) {
            float result = 1.0f;
            for (int i = 0; i < step; i++) {
                result *= base;

            }
            return (result);

        }

        */

        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr2[i]= i * 3  + 1;
        }
        System.out.println(Arrays.toString(arr2));

    }
}
