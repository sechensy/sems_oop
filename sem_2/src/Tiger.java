public class Tiger extends Cat{
    private final int maxRunDistance = 300;
    static int counter;

    public Tiger(String name) {
        super(name);
        counter++;
    }

    @Override
    protected void run(int distance) {
        if (distance <= maxRunDistance){
            System.out.println(name + " пробежал " + distance + "метров");
        }else{
            System.out.println(name + " не пробежал");
        }
    }

}
