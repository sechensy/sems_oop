public class Dog extends Animal{
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;
    static int counter;

    public Dog(String name) {
        super(name);
        counter++;
    }


    @Override
    protected void run(int distance) {
        if (distance <= maxRunDistance){
            System.out.println(name + " пробежал " + distance + " метров");
        }else{
            System.out.println(name + " не пробежал");
        }
    }

    @Override
    protected void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + "метров");
        }else{
            System.out.println(name + " не проплыл");
        }
    }
}
