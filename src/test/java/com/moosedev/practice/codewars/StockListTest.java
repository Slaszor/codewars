package com.moosedev.practice.codewars;

import static org.junit.Assert.*;
import org.junit.Test;

public class StockListTest {

    @Test
    public void test1() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};
        assertEquals("(A : 200) - (B : 1140)",
                StockList.stockSummary(art, cd));
    }

    @Test
    public void test2() {
        String art[] = new String[]{"ABAR 200", "CDXE 70", "BKWR 114", "DRTY 600"};
        String cd[] = new String[] {"B", "C", "W"};
        assertEquals("(B : 114) - (C : 70) - (W : 0)",
                StockList.stockSummary(art, cd));
    }
}
