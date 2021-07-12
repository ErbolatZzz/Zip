package HW1;

import javax.swing.text.Element;
import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //ошибка в том,что не реализован сценарий когда не нужно делить на ноль
    BinaryOperator<Integer> devide = (x, y) -> {
        try {
            if(y>0){
                return x/y;
            } else throw new ArithmeticException("Деление на ноль запрещено");
        } catch (ArithmeticException v){
            System.out.println(v.fillInStackTrace());
        }
        return 0;
    };


    UnaryOperator<Integer> pow = x -> x * x;

    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

    public Calculator() {
    }
}
