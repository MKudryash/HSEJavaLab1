package Task;

public class Task1 {
    /**
     * "удвоенный корень квадратный первого числа" - тут кажется что-то не так с формулировкой.
     * Но допустим, что нужно найти удвоенный квадратный корень первого числа
     */
    public static double MultiplicationCondition(double x, double y) {
        //Если условие не подойдет, то вернет 0
        return (x * y) > 50 ? Math.sqrt(x) * 2 : 0;
    }
}
