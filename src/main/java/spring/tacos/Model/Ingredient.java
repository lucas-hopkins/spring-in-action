package spring.tacos.Model;


public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public Ingredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}
