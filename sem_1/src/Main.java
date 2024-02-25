// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Cat catOne = new Cat("Барсик","black",2); //todo: переименовать значения
        System.out.println(catOne);

        catOne.setColor("white");
        catOne.setAge(100);
        System.out.println(catOne);
        catOne.voice();
    }
}