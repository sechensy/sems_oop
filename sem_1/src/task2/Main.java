package task2;

public class Main {
    public static void main(String[] args) {
        Vector vectorOne = new Vector(3,3,3);
        Vector vectorTwo = new Vector(3,3,3);
        System.out.println(vectorOne);
        System.out.println("Длина вектора: " + vectorOne.length());
        System.out.println("Скалярное проеизведение: " + vectorOne.scalar(vectorTwo));
        System.out.println("Векторное произведение: " + vectorOne.vectorMultiplication(vectorTwo));
        System.out.println("Косинус угола между векторами: " + vectorOne.cos(vectorTwo));
    }
}
