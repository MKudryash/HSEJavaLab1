import java.io.PrintStream;

/** 5. Написать программу, получающую на вход в качестве аргумента два параметра - числа x и y.
    Если произведение этих чисел больше 50,то вычислить удвоенный корень квадратный первого числа.
    Вывести результат на экран.*/
public class Main {
    public static void main(String[] args) {
        //Тут собственно всякие разные исходы
        System.out.printf("При x = 5 и y = 5: " + MultiplicationCondition(5, 5) + "\n");
        System.out.printf("При x = 12 и y = 12: " + MultiplicationCondition(12, 12) + "\n");
        System.out.printf("При x = -5 и y = 12: " + MultiplicationCondition(-5, 12) + "\n");
        System.out.printf("При x = -4 и y = -23: " + MultiplicationCondition(-4, -23) + "\n");
        System.out.printf("При x = 16 и y = 15: " + MultiplicationCondition(16, 15) + "\n");
    }

    /** "удвоенный корень квадратный первого числа" - тут кажется что-то не так с формулировкой.
        Но допустим, что нужно найти удвоенный квадратный корень первого числа*/
    public static double MultiplicationCondition(double x, double y) {
        //Если условие не подойдет, то вернет 0
        return (x * y) > 50 ? Math.sqrt(x) * 2 : 0;
    }
}