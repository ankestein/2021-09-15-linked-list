package model;

public class AnimalList {
    private AnimalListItem head;


    /*
    // Constructor: I can either input an Animal type or an AnimalListItem type in the constructor
    public AnimalList(Animal animal) {
        AnimalListItem newAnimalListItem = new AnimalListItem(animal);
        this.head = newAnimalListItem;
    }
    */

    // Constructor
    public AnimalList(AnimalListItem head) {
        this.head = head;
    }

    // Second (empty) constructor in order to be able to create empty AnimalList
    public AnimalList() {
    }


    public AnimalListItem getHead() {
        return head;
    }

    public void setHead(AnimalListItem head) {
        this.head = head;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "";
        }
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


    public void addAnimal(Animal animal) {
        if (head == null) {
            head = new AnimalListItem(animal);
        } else {
            getTail().setNext(new AnimalListItem(animal));
        }
    }


    private AnimalListItem getTail(){
        AnimalListItem tail = head;

        while (tail.getNext() != null) {
            tail = tail.getNext();
            }
        return tail;
    }

}
