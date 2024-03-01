import java.util.Scanner;
import java.util.function.Function;

public class UI {

    Scanner in = new Scanner(System.in, "cp866");


    public Function<String, Double> inputDouble = msg -> {
        System.out.println(msg);
        return in.nextDouble();
    };

    public int getChoice() {
        System.out.println("Выберите операцию:");
        System.out.println("1-Сумма\n" +
                "2-Вычитание\n" +
                "3-Умножение\n" +
                "4-Деление\n");
        return in.nextInt();
    }
}