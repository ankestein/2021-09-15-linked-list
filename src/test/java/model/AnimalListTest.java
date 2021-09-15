package model;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AnimalListTest {
    @Test
    public void AnimalListToStringTest(){
        // given
        Animal animal1 = new Animal("dog");
        Animal animal2 = new Animal("cat");
        Animal animal3 = new Animal("bird");

        AnimalListItem animal1ListItem = new AnimalListItem(animal1);
        AnimalListItem animal2ListItem = new AnimalListItem(animal2);
        AnimalListItem animal3ListItem = new AnimalListItem(animal3);

        animal1ListItem.setNext(animal2ListItem);
        animal2ListItem.setNext(animal3ListItem);
        AnimalList animalList = new AnimalList(animal1ListItem);

        // when
        String actual = animalList.toString();

        // then
        Assertions.assertEquals("dog -> cat -> bird", actual);
    }
}
