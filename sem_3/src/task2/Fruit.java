package task2;

public enum Fruit {
    APPLE("яблоко"),PINEAPPLE("ананас"),
    ORANGE("апельсин"),MANDARINE("мандарин"),BANANE("банан");

    private String RuNameFruit;

    Fruit(String ruNameFruit) {
        RuNameFruit = ruNameFruit;
    }

    public String getRuNameFruit() {
        return RuNameFruit;
    }
}
