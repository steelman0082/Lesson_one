package geekbrains.java_level_one.lesson_three;

/**
 * Created by wallb on 21.01.17.
 */
public class krestiki {

    static char[][] field = new char[3][3];
    static final char playerDot = 'X';
    static final char aiDot = 'O';
    static final char emptyDot = '*';

    public static void initField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field [i][j] = emptyDot;

            }
            System.out.println("kjfnsjn");

        }
    }

    public static void main(String[] args) {

        initField();
        String name =  "0";
        if (name.length() !=0 ) {
            System.out.println(name.length());
        }

    }

}
