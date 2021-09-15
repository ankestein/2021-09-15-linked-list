package model;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AnimalListTest {
    @Test
    public void testToString(){
        // given
        Animal animal1 = new Animal("dog");
        Animal animal2 = new Animal("cat");
        Animal animal3 = new Animal("bird");

        AnimalList animalList = new AnimalList(new AnimalListItem(animal1));
        animalList.addAnimal(animal2);
        animalList.addAnimal(animal3);

        // when
        String actual = animalList.toString();

        // then
        Assertions.assertEquals("dog -> cat -> bird", actual);
    }

    @Test
    public void testToStringEmptyList(){
        // given
        AnimalList animalList = new AnimalList();

        // when
        String actual = animalList.toString();

        // then
        Assertions.assertEquals("", actual);
    }

    @Test
    public void testAddAnimal(){
        // given
        Animal animal1 = new Animal("dog");
        Animal animal2 = new Animal("cat");
        Animal animal3 = new Animal("bird");

        // (expected)
        AnimalListItem animal1ListItem = new AnimalListItem(animal1);
        AnimalListItem animal2ListItem = new AnimalListItem(animal2);
        AnimalListItem animal3ListItem = new AnimalListItem(animal3);

        animal1ListItem.setNext(animal2ListItem);
        animal2ListItem.setNext(animal3ListItem);
        AnimalList animalList = new AnimalList(animal1ListItem);

        String expected = animalList.toString();

        // when
        AnimalListItem animalListItemActual = new AnimalListItem(animal1);
        AnimalList animalListActual = new AnimalList(animalListItemActual);
        animalListActual.addAnimal(animal2);
        animalListActual.addAnimal(animal3);

        // then
        Assertions.assertEquals(expected, animalListActual.toString());

    }


    @Test
    public void testAddFirstItem() {
        // given
        AnimalList animalList = new AnimalList();
        Animal animal = new Animal();
        animal.setName("dog");
        // when
        animalList.addAnimal(animal);
        // then
        Assertions.assertEquals("dog", animalList.toString());
    }

    @Test
    public void testAddSecondItem() {
        // given
        AnimalList animalList = new AnimalList();

        Animal animal1 = new Animal();
        animal1.setName("dog");
        Animal animal2 = new Animal();
        animal2.setName("cat");
        animalList.addAnimal(animal1);

        // when
        animalList.addAnimal(animal2);
        // then
        Assertions.assertEquals("dog -> cat", animalList.toString());
    }




    @Test
    public void testRemoveFirstElement() {
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal();
        animal1.setName("Hund");
        Animal animal2 = new Animal();
        animal2.setName("Katze");
        animalList.addAnimal(animal1);
        animalList.addAnimal(animal2);
        //WHEN
        animalList.remove(animal1);
        //THEN
        Assertions.assertEquals("Katze", animalList.toString());
    }

    @Test
    public void testRemoveLastElement() {
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal();
        animal1.setName("Hund");
        Animal animal2 = new Animal();
        animal2.setName("Katze");
        animalList.addAnimal(animal1);
        animalList.addAnimal(animal2);
        //WHEN
        animalList.remove(animal2);
        //THEN
        Assertions.assertEquals("Hund", animalList.toString());
    }

    @Test
    public void testRemoveMiddleElement() {
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal();
        animal1.setName("Hund");
        Animal animal2 = new Animal();
        animal2.setName("Katze");
        Animal animal3 = new Animal();
        animal3.setName("Tiger");
        animalList.addAnimal(animal1);
        animalList.addAnimal(animal2);
        animalList.addAnimal(animal3);
        //WHEN
        animalList.remove(animal2);
        //THEN
        Assertions.assertEquals("Hund -> Tiger", animalList.toString());
    }

    @Test
    public void testRemoveNotExistingElement() {
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal();
        animal1.setName("Hund");

        //WHEN
        animalList.remove(animal1);
        //THEN
        Assertions.assertEquals("", animalList.toString());
    }

    @Test
    public void testRemoveMultipleElement() {
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal();
        animal1.setName("Hund");
        Animal animal2 = new Animal();
        animal2.setName("Hund");

        animalList.addAnimal(animal1);
        animalList.addAnimal(animal2);

        //WHEN
        animalList.remove(animal1);
        //THEN
        Assertions.assertEquals("", animalList.toString());
    }





}
