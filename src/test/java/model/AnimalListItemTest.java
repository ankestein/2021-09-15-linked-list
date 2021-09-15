package model;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AnimalListItemTest {

    @Test
    public void AnimalListItemToStringTest(){
        // given
        Animal animal = new Animal("cat");
        AnimalListItem animalListItem1 = new AnimalListItem(animal);
        // when
        String actual = animalListItem1.toString();
        // then
        Assertions.assertEquals("AnimalListItem{value=Animal{name='cat'}, next=null}", actual);
    }
}
