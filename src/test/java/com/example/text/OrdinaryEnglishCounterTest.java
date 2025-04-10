package com.example.text;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OrdinaryEnglishCounterTest {

    @Test
    public void testCreateCountMap_normalCases()
    {
        var testArray = new String[]{"worda", "wordb", "worda", "wordc", "wordc", "worda"};
        var counter = new OrdinaryEnglishCounter();
        var countsMap = counter.createCountsMap(testArray);
        assertEquals(3, (int)countsMap.get("worda"));
        assertEquals(1, (int)countsMap.get("wordb"));
        assertEquals(2, (int)countsMap.get("wordc"));
    }
}
