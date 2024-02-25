public abstract class Animal {
    protected String name;

    protected abstract void run(int distance);

    protected abstract void swim(int distance);

    static int counter;

    public Animal(String name) {
        this.name = name;
        counter++;
    }
}
