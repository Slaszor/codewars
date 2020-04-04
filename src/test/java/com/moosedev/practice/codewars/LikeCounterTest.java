package com.moosedev.practice.codewars;

import org.junit.Test;
        import static org.junit.Assert.assertEquals;

public class LikeCounterTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", LikeCounter.whoLikesIt());
        assertEquals("Peter likes this", LikeCounter.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", LikeCounter.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", LikeCounter.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", LikeCounter.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}