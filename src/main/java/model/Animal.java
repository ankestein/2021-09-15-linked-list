package model;

public class Animal {
    private String name;

    //Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Second (empty) constructor in order to be able to create empty Animal
    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
