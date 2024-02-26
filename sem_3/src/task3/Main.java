package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractGame ag = new NumberGame();
        ag.start(5,3);
        System.out.println("Введи значение ");
        Scanner value = new Scanner(System.in);
        while (ag.getGameStatus().equals(GameStatus.START)){
            Answer answer = ag.inputValue(value.nextLine());
            System.out.println(answer);
        }
        if (ag.getGameStatus().equals(GameStatus.WIN)){
            System.out.println("Вы победили");
        } else if (ag.getGameStatus().equals(GameStatus.LOOSE)){
            System.out.println("Вы проиграли");
        }
        else {
            System.out.println("Неопознанный статус");
        }
    }
}
