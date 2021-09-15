package model;

public class AnimalList {
    private AnimalListItem head;

    // Constructor
    /*
    // I can either input an Animal type or an AnimalListItem type in the constructor (Animal is easier)
    public AnimalList(Animal animal) {
        AnimalListItem newAnimalListItem = new AnimalListItem(animal);
        this.head = newAnimalListItem;
    }
    */

    public AnimalList(AnimalListItem head) {
        this.head = head;
    }

    public AnimalListItem getHead() {
        return head;
    }

    public void setHead(AnimalListItem head) {
        this.head = head;
    }

    @Override
    public String toString() {
       String animalString = head.getValue().toString();
       AnimalListItem listItem = head.getNext();

       while(listItem != null){
           animalString = animalString +
                   " -> " +
                   listItem.getValue().toString();
           listItem = listItem.getNext();
       }
       return animalString;
   }


    public void addAnimal(Animal animal){
        AnimalListItem newAnimalListItem = new AnimalListItem(animal);

        AnimalListItem nextListItem = head.getNext();

        while (nextListItem != null) {
            nextListItem = nextListItem.getNext();
        }
        nextListItem.setNext(newAnimalListItem);

    }

}
