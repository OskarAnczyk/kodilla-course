package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        Country country1 = new Country(new BigDecimal("10000000"));
        Country country2 = new Country(new BigDecimal("10000000"));
        Country country3 = new Country(new BigDecimal("10000000"));
        continent1.add(country1);
        continent1.add(country2);
        continent2.add(country3);
        world.add(continent1);
        world.add(continent2);
        //When
        BigDecimal result = world.getPeopleQuantity();
        //Then
        BigDecimal expected = new BigDecimal("30000000");
        assertEquals(expected,result);
    }
}
