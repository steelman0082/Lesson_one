package geekbrains.java_level_one.lesson_two;

/**
 * Created by wallb on 21.01.17.
 */
public class my {

    private static void crossFill(int[][] array){
        int strght, bckwd;
        for (strght = 0, bckwd = array.length - 1;
             strght < array.length;
             strght++,
                     bckwd--) {
            array[strght][bckwd] = 0;
            array[strght][strght] = 1;
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) System.out.println("Hello" + i);

        final int side = 10;
        int[][] dArr = new int[side][side];
        crossFill(dArr);
        for (int i = 0; i < dArr.length; i++) {
            for (int j = 0; j < dArr[i].length; j++) {
                System.out.print(dArr[i][j] + " ");
            }
            System.out.println();
        }


    }

}
