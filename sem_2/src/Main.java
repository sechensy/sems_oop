import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");
        HomeCat cat = new HomeCat("Кеша");

        List<Animal> animalList = new ArrayList<>(Arrays.asList(
                new HomeCat("Боня"),
                new Dog("Бима"),
                new Tiger("Тигр")
        ));
        for (Animal animal : animalList) {
            animal.run(new Random().nextInt(100,700));
            animal.swim(new Random().nextInt(15));
        }

    }
}