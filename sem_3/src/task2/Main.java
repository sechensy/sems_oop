package task2;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = Fruit.BANANE;
        switch (fruit){
            case APPLE,ORANGE,MANDARINE,PINEAPPLE,BANANE -> System.out.println(fruit.getRuNameFruit());
            default -> System.out.println("Такого фрукта нет");
        }

    }
}
