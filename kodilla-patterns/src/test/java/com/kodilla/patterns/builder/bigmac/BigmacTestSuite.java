package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder(){
        //Given
        //When
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Bun")
                .ingredient(Ingredients.CABBAGE)
                .sauce(Sauces.STANDARD)
                .burgers(2)
                .ingredient(Ingredients.BACON)
                .build();
        //Then
        assertAll(
                () -> assertEquals(bigmac.getBun(),"Bun"),
                () -> assertEquals(bigmac.getBurgers(),2),
                () -> assertEquals(bigmac.getSauce(),Sauces.STANDARD),
                () -> assertEquals(bigmac.getIngredients().get(1),Ingredients.BACON)
        );
    }
}
