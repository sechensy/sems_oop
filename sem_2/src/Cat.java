public abstract class Cat extends Animal {
    private final int maxRunDistance = 200;
    private final int maxSwimDistance = 0;
    static int counter;

    public Cat(String name) {
        super(name);
        counter++;
    }

    @Override
    protected void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }
}
