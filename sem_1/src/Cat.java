public class Cat extends Animal{
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public Cat() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0 && age<40){
            this.age = age;
        } else{
            System.out.println("Введенный возраст некорректен");
        }
    }

    @Override
    protected void voice() {
        System.out.println(toString()+" Мяукает!");
    }

    @Override
    protected void animalInfo() {
        System.out.println(" мявк! мявк!");
    }

    @Override
    protected void jump() {
        System.out.println(" прыг! ");
    }

    public void klubok(){
        System.out.println("Кот свернулся в клубок");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
