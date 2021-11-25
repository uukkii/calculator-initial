import java.util.function.*;

public final class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    final BinaryOperator<Integer> plus = Integer::sum;
    final BinaryOperator<Integer> minus = (x, y) -> x - y;
    final BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // final BinaryOperator<Integer> devide = (x, y) -> x / y;
    final BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : y;

    final UnaryOperator<Integer> pow = x -> x * x;
    final UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    final Predicate<Integer> isPossitive = x -> x > 0;

    final Consumer<Integer> println = System.out::println;

}
