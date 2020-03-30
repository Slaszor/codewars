package com.moosedev.practice.codewars;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumSquaredDivisorsTest {

    @Test
    public void test1() {
        assertEquals("[[1, 1], [42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(1, 250));
    }
    @Test
    public void test2() {
        assertEquals("[[42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(42, 250));
    }
    @Test
    public void test3() {
        assertEquals("[[287, 84100]]", SumSquaredDivisors.listSquared(250, 500));
    }
    @Test
    public void test10() {
        assertEquals("[[6237, 45024100], [9799, 96079204], [9855, 113635600]]", SumSquaredDivisors.listSquared(6237, 9855));
    }

}
