public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2); // 3
        int b = calc.minus.apply(1, 1); // 0
        int c = calc.devide.apply(a, b); // 3/0 (Деление на ноль запрещено.)
                                        // Необходимо в переменной devide сделать проверку y != 0;
                                        // Реализовать можно с помощью тернарного оператора.
                                        // Если пользователь будет делить на 0, возвращать в качетсве ответа 0.
        calc.println.accept(c);



    }

}
