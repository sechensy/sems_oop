public abstract class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void animalInfo(){
        System.out.println("животное по имени: " + name);
    }

    protected abstract void voice();

    protected void jump(){
        System.out.println("животное по имени: " + name + " подпрыгнуло");
    }
}
