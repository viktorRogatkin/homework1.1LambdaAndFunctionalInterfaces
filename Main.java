package homework11;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}
//Exception in thread "main" java.lang.ArithmeticException: деление на ноль(ОШИБКА:деление на ноль)
//	at homework11.Calculator.lambda$new$3(Calculator.java:18) (переменная хранящая лямбда выражение функцию деления)
//	at <unknown class>.apply(Unknown Source)
//	at homework11.Main.main(Main.java:11) (Класс Main: 11 строка. Функция деления)
//