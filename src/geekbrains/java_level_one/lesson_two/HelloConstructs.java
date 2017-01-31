package geekbrains.java_level_one.lesson_two;

import java.util.*;

public class HelloConstructs {
    private static void change(int[] array){
        for (int i = 0; i < array.length; i++)
            array[i] = (array[i] == 1) ? 0 : 1;
    }

    private static void fillIn(int[] array){
        for (int i = 0; i < array.length; i++)
            array[i] = i * 3 + 1;
    }

    private static void doubling(int[] array){
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6) array[i] *= 2;
    }

    private static int findMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            max = (array[i] > max) ? array[i] : max;
        return max;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int index : array) min = (index < min) ? index : min;
        return min;
    }

    private static void crossFill(int[][] array){
        int strght, bckwd;
        for (strght = 0,
                     bckwd = array.length - 1;
             strght < array.length;
             strght++,
                     bckwd--) {
            array[strght][bckwd] = 1;
            array[strght][strght] = 1;
        }
    }

    private static float power(float base, float significative){
        float res = 1.0f;
        for (int i = 0; i < significative; i++) {
            res *= base;
        }
        return res;
    }

    private static void calculator() {
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        float first = 0;
        float second = 0;
        int counter = 0;
        String divZeroMessage;
        String operator;
        System.out.println("Here we put numbers, operator, and get the result");
        do {
            System.out.print("Enter the operator (ex. + / * - ^) or 'exit' without quotes to quit! >>> ");
            operator = scanner.next();
            if (!Objects.equals(operator, "exit")) {
                System.out.print("Enter the first number, be sure not to input characters! >>> ");
                first = scanner.nextFloat();
                if (operator.equals("/")) {
                    do {
                        switch (counter) {
                            case 0:
                                divZeroMessage = "Enter the second number, should not be zero! >>> ";
                                break;
                            case 1:
                                divZeroMessage = "Come on, don't try zero here! >>> ";
                                break;
                            case 2:
                                divZeroMessage = "Seriously? O_o >>> ";
                                break;
                            case 3:
                                divZeroMessage = "I give up, do whatever you want... >>> ";
                                break;
                            default:
                                divZeroMessage = "No zeroes in divider allowed! >>> ";
                                break;
                        }
                        System.out.print(divZeroMessage);
                        second = scanner.nextFloat();
                        counter++;
                    } while (second == 0);
                } else {
                    System.out.print("Enter the second number, rules are the same! >>> ");
                    second = scanner.nextFloat();
                }
            }
            System.out.print("Your result is: ");
            switch (operator) {
                case "+":
                    System.out.println(first + second);
                    break;
                case "-":
                    System.out.println(first - second);
                    break;
                case "*":
                    System.out.println(first * second);
                    break;
                case "/":
                    System.out.println(first / second);
                    break;
                case "^":
                    System.out.println(power(first, second));
                    break;
                case "exit":
                    System.out.println("getting outta here!");
                    work = false;
                    break;
            }
        } while (work);
    }

    private static boolean checkBalance(int[] array) {
        int right = 0, left = 0;
        for (int i = 0; i < array.length - 1; i++){
            left += array[i];
            for (int j = i + 1; j < array.length; j++)
                right += array[j];
            if (left == right) return true;
            right = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        /**
         * 1.   Создать массив, состоящий из элементов 0 и 1,
         * например, int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
         */
        int[] bin = {1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0};
        System.out.println(Arrays.toString(bin));

        /**
         * 2.   В массиве из предыдущего пункта с помощью цикла
         * заменить 0 на 1, 1 на 0;
         */
        change(bin);
        System.out.println(Arrays.toString(bin));

        /**
         * 3.   Создать массив из 8 целых чисел.
         * С помощью цикла заполнить его значениями
         * 1 4 7 10 13 16 19 22;
         */
        int[] arrInt = new int[8];
        fillIn(arrInt);
        System.out.println(Arrays.toString(arrInt));

        /**
         * 4.   Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
         * пройти по нему циклом, и числа, которые меньше 6, умножить на 2.
         */
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        doubling(mas);
        System.out.println(Arrays.toString(mas));

        /**
         * 5.	* Задать одномерный массив и найти в нем
         * минимальный и максимальный элементы;
         */
        System.out.println(findMax(mas));
        System.out.println(findMin(mas));

        /**
         * 5.   Создать квадратный двумерный целочисленный
         * массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */
        final int side = 10;
        int[][] dArr = new int[side][side];
        crossFill(dArr);
        for (int i = 0; i < dArr.length; i++) {
            for (int j = 0; j < dArr[i].length; j++) {
                System.out.print(dArr[i][j] + " ");
            }
            System.out.println();
        }

        /**
         * 6.	** Написать простой консольный калькулятор.
         * Пользователь вводит два числа и операцию,
         * которую хочет выполнить, программа вычисляет результат
         * и выводит в консоль;
         */
        System.out.println("The Calculator.");
        calculator();

        /**
         * 7.   ** Написать метод, в который передается не пустой
         * одномерный целочисленный массив, метод должен вернуть
         * true если в массиве есть место, в котором сумма
         * левой и правой части массива равны.
         * Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
         * checkBalance ([2, 1, 1, 2, 1]) → false,
         * checkBalance ([10, || 10]) → true,
         * граница показана символами ||, эти символы в массив не входят.
         */
        int[] balance = {0,31,7,2,3};
        System.out.println(checkBalance(balance));

    }
}

/*
    public static short[] changeZeroOne (short[] in_mas){
        for (int inc = 0; inc < in_mas.length; inc++) {
            if (in_mas[inc] == 0) in_mas[inc] = 1;
            else in_mas[inc] = 0;
        }
        return in_mas;
    }

    for (int inc = 0, plus3 = 1; inc < in_mas.length; inc++, plus3+=3){
            in_mas[inc] = (short) plus3;
    }

    public static int[] zeroToOne(int[] inArr) {
        int l=inArr.length;
        for (int i=0;i<l;i++) {
            inArr[i]=1-inArr[i];
        }
        return inArr;
    }
    public static int[] mulToSix(int[] inArr) {
        int mul;
        int lArr=inArr.length;
        for (int i=0;i<lArr;i++){
            mul=2-((inArr[i]-6)/abs(inArr[i]-6)+1)/2;
            inArr[i]=inArr[i]*mul;
        }
        return inArr;
    }

*/
