package geekbrains.level_one.lesson_one;

public class main {

    /**
     * Написать метод вычисляющий выражение a * (b + (c / d)) и
     * возвращающий результат, где a,b,c,d – входные параметры этого метода.
     */
    private static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    private static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /**
     *
     * Написать метод, принимающий на вход два числа, и проверяющий
     * что их сумма лежит в пределах 10 до 20, если да – вернуть true,
     * в противном случае – false.
     */
    private static boolean checkTwoNumbers(int first, int second){
        int sum = first + second;
        return sum < 21 && sum > 11;
    }

    /**
     * Написать метод, который определяет является ли год високосным.
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */
    private static boolean isLeapYear(int year){
        return (year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.println(calculate(1,2,3,4));
        System.out.println(calculate(1,2,3,4.0f));
        System.out.println(checkTwoNumbers(1, 15));
        System.out.println(isLeapYear(2016));
    }
}

/*
    1. Как в редакторе "IntelliJ IDEA" можно клавиатурными сочетаниями(или правой кнопки мыши) 
    закомментировать строки кода, чтобы не ставить /* и */

    /*2. Как правильно оформлять задания? Каждое задание на отдельной странице?
    Не могли бы вы дать какой-нибудь шаблон для оформления кода заданий.
  
    import org.jetbrains.annotations.Contract;

    public static boolean sumAt10To20 (float a, float b) {
        if (a + b >= 10 && a + b <= 20)
           return true;
        else
            return false;
    }

    public static boolean ten_to_twenty(int a, int b) {
        boolean rez = false;
        if ((a + b) >= 10 & (a + b) <= 20) rez = true;
        else {
            rez = false;
        }
        return rez;
    }

    public static void isLeapYear (int year) {
    if (year % 100 == 0)
        if (year % 400 == 0)
            System.out.println(year + " year is a leap-year.");
        else
            System.out.println(year + " year isn't a leap-year.");
    else
        if (year % 4 == 0)
            System.out.println(year + " year is a leap-year.");
        else
            System.out.println(year + " year isn't a leap-year.");
    }
  
    public static String homeWorkOne(short year) {
    if (year % 100 == 0 && year % 400 !=0)
        return " год не високосный";
    else
        if (year % 4 == 0)
            return " год високосный";
        else
            return  " год не високосный";
    }

    public static boolean unit4 (double a, double b){
    if (a+b >=10 || a+b <=20) {     // А если значение будет 100, то условие всё равно сработает
        return true;
    }
    return false;
    }

    public static boolean visocosniy(int year){

        boolean vis = false;

        if (year%4 == 0){
            vis = true;
        }
        if (year%100 == 0){
            vis = false;
        }
        if (year%400 == 0){
            vis = true;
        }

        return vis;
    }

    if (year < -45) {
        System.out.println("Понятия високосного года еще не существовало");
        return false;


*/
