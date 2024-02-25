public class HomeCat extends Cat{
    private final int maxRunDistance = 200;
    static int counter;

    public HomeCat(String name) {
        super(name);
        counter++;
    }

    @Override
    protected void run(int distance) {
        if (distance <= maxRunDistance){
            System.out.println(name + " Домашний кот пробежал " + distance + "метров");
        }else{
            System.out.println(name + " Домашний кот не пробежал");
        }
    }
}
