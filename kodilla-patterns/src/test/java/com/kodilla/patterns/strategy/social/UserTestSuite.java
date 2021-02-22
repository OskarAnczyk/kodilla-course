package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        Millenials millenials = new Millenials("m");
        YGeneration yGeneration = new YGeneration("y");
        ZGeneration zGeneration = new ZGeneration("z");
        //When
        //Then
        assertEquals(millenials.sharePost(),"Posting on Facebook");
        assertEquals(yGeneration.sharePost(),"Posting on Twitter");
        assertEquals(zGeneration.sharePost(),"Posting on Snapchat");
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        Millenials millenials = new Millenials("m");
        YGeneration yGeneration = new YGeneration("y");
        ZGeneration zGeneration = new ZGeneration("z");
        //When
        millenials.setSocialPublisher(new SnapchatPublisher());
        yGeneration.setSocialPublisher(new FacebookPublisher());
        zGeneration.setSocialPublisher(new TwitterPublisher());
        //Then
        assertEquals(millenials.sharePost(),"Posting on Snapchat");
        assertEquals(yGeneration.sharePost(),"Posting on Facebook");
        assertEquals(zGeneration.sharePost(),"Posting on Twitter");
    }
}
