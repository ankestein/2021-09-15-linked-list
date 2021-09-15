package model;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AnimalTest {

    @Test
    public void AnimalToStringTest(){
        // given
        Animal animal = new Animal("dog");

        // when
        String actual = animal.toString();

        // then
        Assertions.assertEquals("Animal{name='dog'}", actual);
    }
}
