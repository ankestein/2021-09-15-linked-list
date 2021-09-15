package model;

public class AnimalListItem {
    private Animal value;
    private AnimalListItem next;

    // constructor
    public AnimalListItem(Animal value) {
        this.value = value;
        }

    // getter and setter
    public Animal getValue(){
        return value;
    }

    public void setValue(Animal value){
        this.value = value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "AnimalListItem{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }

}
