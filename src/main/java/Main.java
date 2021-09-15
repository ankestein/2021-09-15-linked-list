import model.Animal;
import model.AnimalListItem;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal("dog");
        Animal animal2 = new Animal("cat");
        Animal animal3 = new Animal("bird");

        AnimalListItem animal1ListItem = new AnimalListItem(animal1);
        AnimalListItem animal2ListItem = new AnimalListItem(animal2);
        AnimalListItem animal3ListItem = new AnimalListItem(animal3);

        System.out.println(animal1ListItem.toString());
    }
}
