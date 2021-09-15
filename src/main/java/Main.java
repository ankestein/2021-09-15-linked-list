import model.Animal;
import model.AnimalList;
import model.AnimalListItem;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal("dog");
        Animal animal2 = new Animal("cat");
        Animal animal3 = new Animal("bird");

        AnimalListItem animal1ListItem = new AnimalListItem(animal1);
        AnimalListItem animal2ListItem = new AnimalListItem(animal2);
        AnimalListItem animal3ListItem = new AnimalListItem(animal3);

        animal1ListItem.setNext(animal2ListItem);
        animal2ListItem.setNext(animal3ListItem);
        AnimalList animalList = new AnimalList(animal1ListItem);
        System.out.println(animalList.toString());

        Animal animal4 = new Animal("cow");
        animalList.addAnimal(animal4);
        System.out.println(animalList);


    }
}
